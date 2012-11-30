package com.googlecode.whiteprint.jcip.pools;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * PuzzleSolver
 * <p/>
 * Solver that recognizes when no solution exists
 *
 * @author Brian Goetz and Tim Peierls
 */
public class PuzzleSolver <P,M> extends ConcurrentPuzzleSolver<P, M> {
    PuzzleSolver(Puzzle<P, M> puzzle) {
        super(puzzle);
    }

    private final AtomicInteger taskCount = new AtomicInteger(0);

    protected Runnable newTask(P p, M m, PuzzleNode<P, M> n) {
        return new CountingSolverTask<P, M>(p, m, n, taskCount, solution, puzzle, exec, seen);
    }

}
