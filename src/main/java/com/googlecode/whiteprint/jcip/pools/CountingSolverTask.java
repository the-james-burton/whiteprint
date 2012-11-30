package com.googlecode.whiteprint.jcip.pools;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

class CountingSolverTask<P, M> extends SolverTask<P, M> {

    AtomicInteger taskCount;
    ValueLatch<PuzzleNode<P, M>> solution;

    CountingSolverTask(P pos, M move, PuzzleNode<P, M> prev,
	    AtomicInteger taskCount, ValueLatch<PuzzleNode<P, M>> solution, Puzzle<P, M> puzzle,
	    ExecutorService exec, ConcurrentMap<P, Boolean> seen) {
	super(pos, move, prev, solution, puzzle, exec, seen);
	this.taskCount = taskCount;
	this.solution = solution;
	this.taskCount.incrementAndGet();
    }

    public void run() {
	try {
	    super.run();
	} finally {
	    if (taskCount.decrementAndGet() == 0)
		solution.setValue(null);
	}
    }
}