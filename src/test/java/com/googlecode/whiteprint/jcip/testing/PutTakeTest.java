package com.googlecode.whiteprint.jcip.testing;

import java.io.IOException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * PutTakeTest
 * <p/>
 * Producer-consumer test program for BoundedBuffer
 * 
 * @author Brian Goetz and Tim Peierls
 */
public class PutTakeTest implements Runnable {
    protected static final ExecutorService pool = Executors
	    .newCachedThreadPool();
    protected CyclicBarrier barrier;
    protected SemaphoreBoundedBuffer<Integer> bb;
    protected int nTrials, nPairs;
    protected final AtomicInteger putSum = new AtomicInteger(0);
    protected final AtomicInteger takeSum = new AtomicInteger(0);

    @Test
    public void test() throws IOException {
	PutTakeTest me = new PutTakeTest(); // sample parameters
	me.setup(10, 10, 100000);
	me.run();
	pool.shutdown();
    }

    public void setup(int capacity, int pairs, int trials) {
	bb = new SemaphoreBoundedBuffer<Integer>(capacity);
	nTrials = trials;
	nPairs = pairs;
	barrier = new CyclicBarrier(pairs * 2 + 1);

    }
    
    @Override
    public void run() {
	try {
	    for (int i = 0; i < nPairs; i++) {
		pool.execute(new Producer(barrier, bb, i, putSum));
		pool.execute(new Consumer(barrier, bb, i, takeSum));
	    }
	    barrier.await(); // wait for all threads to be ready
	    barrier.await(); // wait for all threads to finish
	    TestCase.assertEquals(putSum.get(), takeSum.get());
	} catch (Exception e) {
	    throw new RuntimeException(e);
	}
    }

}
