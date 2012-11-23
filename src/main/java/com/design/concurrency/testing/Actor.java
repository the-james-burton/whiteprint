package com.design.concurrency.testing;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class Actor {

    protected final CyclicBarrier barrier;
    protected final SemaphoreBoundedBuffer<Integer> bb;
    protected final int nTrials;
    protected final AtomicInteger asum;

    public Actor(CyclicBarrier barrier, SemaphoreBoundedBuffer<Integer> bb,
	    int nTrials, AtomicInteger asum) {
	this.barrier = barrier;
	this.bb = bb;
	this.nTrials = nTrials;
	this.asum = asum;
    }

}
