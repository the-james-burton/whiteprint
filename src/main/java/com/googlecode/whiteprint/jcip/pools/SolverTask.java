package com.googlecode.whiteprint.jcip.pools;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;

public class SolverTask<P, M> extends PuzzleNode<P, M> implements Runnable {

    ValueLatch<PuzzleNode<P, M>> solution;
    Puzzle<P, M> puzzle;
    ExecutorService exec;
    ConcurrentMap<P, Boolean> seen;

    SolverTask(P pos, M move, PuzzleNode<P, M> prev,
	    ValueLatch<PuzzleNode<P, M>> solution, Puzzle<P, M> puzzle,
	    ExecutorService exec, ConcurrentMap<P, Boolean> seen) {
	super(pos, move, prev);
	this.solution = solution;
	this.puzzle = puzzle;
	this.exec = exec;
	this.seen = seen;
    }

    public void run() {
	if (solution.isSet() || seen.putIfAbsent(pos, true) != null)
	    return; // already solved or seen this position
	if (puzzle.isGoal(pos))
	    solution.setValue(this);
	else
	    for (M m : puzzle.legalMoves(pos))
		exec.execute(newTask(puzzle.move(pos, m), m, this));
    }
    
    protected Runnable newTask(P p, M m, PuzzleNode<P, M> n) {
        return new SolverTask<P, M>(p, m, n, solution, puzzle, exec, seen);
    }
}