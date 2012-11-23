package com.design.concurrency.building;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Worker implements Runnable {
    private final Board board;
    private final CyclicBarrier barrier;

    public Worker(Board board, CyclicBarrier barrier) {
	this.board = board;
	this.barrier = barrier;
    }

    public void run() {
	while (!board.hasConverged()) {
	    for (int x = 0; x < board.getMaxX(); x++)
		for (int y = 0; y < board.getMaxY(); y++)
		    board.setNewValue(x, y, computeValue(x, y));
	    try {
		barrier.await();
	    } catch (InterruptedException ex) {
		return;
	    } catch (BrokenBarrierException ex) {
		return;
	    }
	}
    }

    private int computeValue(int x, int y) {
	// Compute the new value that goes in (x,y)
	return 0;
    }
}