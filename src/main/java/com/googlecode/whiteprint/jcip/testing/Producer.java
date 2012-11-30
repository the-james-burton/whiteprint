package com.googlecode.whiteprint.jcip.testing;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

class Producer extends Actor implements Runnable {

    public Producer(CyclicBarrier barrier, SemaphoreBoundedBuffer<Integer> bb,
	    int nTrials, AtomicInteger asum) {
	super(barrier, bb, nTrials, asum);
	// TODO Auto-generated constructor stub
    }

    public void run() {
	try {
	    int seed = (this.hashCode() ^ (int) System.nanoTime());
	    int sum = 0;
	    barrier.await();
	    for (int i = nTrials; i > 0; --i) {
		bb.put(seed);
		sum += seed;
		seed = xorShift(seed);
	    }
	    asum.getAndAdd(sum);
	    barrier.await();
	} catch (Exception e) {
	    throw new RuntimeException(e);
	}
    }
    
    static int xorShift(int y) {
        y ^= (y << 6);
        y ^= (y >>> 21);
        y ^= (y << 7);
        return y;
    }
}