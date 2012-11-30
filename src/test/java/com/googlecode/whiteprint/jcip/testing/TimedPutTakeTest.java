package com.googlecode.whiteprint.jcip.testing;

import java.util.concurrent.CyclicBarrier;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * TimedPutTakeTest
 * <p/>
 * Testing with a barrier-based timer
 * 
 * @author Brian Goetz and Tim Peierls
 */
public class TimedPutTakeTest extends PutTakeTest {
    private BarrierTimer timer = new BarrierTimer();

    public TimedPutTakeTest() {
	super();
	barrier = new CyclicBarrier(nPairs * 2 + 1, timer);
    }

    @Override
    public void run() {
	try {
	    timer.clear();
	    for (int i = 0; i < nPairs; i++) {
		pool.execute(new Producer(barrier, bb, i, putSum));
		pool.execute(new Consumer(barrier, bb, i, putSum));
	    }
	    barrier.await();
	    barrier.await();
	    long nsPerItem = timer.getTime() / (nPairs * (long) nTrials);
	    System.out.print("Throughput: " + nsPerItem + " ns/item");
	    TestCase.assertEquals(putSum.get(), takeSum.get());
	} catch (Exception e) {
	    throw new RuntimeException(e);
	}
    }

    @Test
    public void testTimed() throws Exception {
	PutTakeTest me = new PutTakeTest(); // sample parameters
	me.setup(10, 10, 100000);
	int tpt = 100000; // trials per thread
	for (int cap = 1; cap <= 1000; cap *= 10) {
	    System.out.println("Capacity: " + cap);
	    for (int pairs = 1; pairs <= 128; pairs *= 2) {
		TimedPutTakeTest t = new TimedPutTakeTest();
		t.setup(cap, pairs, tpt);
		System.out.print("Pairs: " + pairs + "\t");
		t.run();
		System.out.print("\t");
		Thread.sleep(1000);
		t.run();
		System.out.println();
		Thread.sleep(1000);
	    }
	}
	PutTakeTest.pool.shutdown();
    }
}
