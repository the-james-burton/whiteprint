package com.design.concurrency.testing;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

class Consumer extends Actor implements Runnable {
    
    public Consumer(CyclicBarrier barrier, SemaphoreBoundedBuffer<Integer> bb,
	    int nTrials, AtomicInteger asum) {
	super(barrier, bb, nTrials, asum);
	// TODO Auto-generated constructor stub
    }

    public void run() {
	try {
	    barrier.await();
	    int sum = 0;
	    for (int i = nTrials; i > 0; --i) {
		sum += bb.take();
	    }
	    asum.getAndAdd(sum);
	    barrier.await();
	} catch (Exception e) {
	    throw new RuntimeException(e);
	}
    }
}