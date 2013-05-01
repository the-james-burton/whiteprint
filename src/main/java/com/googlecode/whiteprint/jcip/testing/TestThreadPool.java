package com.googlecode.whiteprint.jcip.testing;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * TestingThreadFactory
 * <p/>
 * Testing thread pool expansion
 * 
 * @author Brian Goetz and Tim Peierls
 */
public class TestThreadPool {

    private final TestingThreadFactory threadFactory = new TestingThreadFactory();

    public void testPoolExpansion() throws InterruptedException {
	int MAX_SIZE = 10;
	ExecutorService exec = Executors.newFixedThreadPool(MAX_SIZE);

	for (int i = 0; i < 10 * MAX_SIZE; i++)
	    exec.execute(new Runnable() {
		public void run() {
		    try {
			Thread.sleep(Long.MAX_VALUE);
		    } catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		    }
		}
	    });
	for (int i = 0; i < 20 && threadFactory.numCreated.get() < MAX_SIZE; i++)
	    Thread.sleep(100);
	assert threadFactory.numCreated.get() == MAX_SIZE;
	exec.shutdownNow();
    }
}
