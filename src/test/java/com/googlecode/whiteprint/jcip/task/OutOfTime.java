package com.googlecode.whiteprint.jcip.task;

import static java.util.concurrent.TimeUnit.SECONDS;

import java.util.Timer;

import org.junit.Test;

/**
 * OutOfTime
 * <p/>
 * Class illustrating confusing Timer behavior
 * 
 * @author Brian Goetz and Tim Peierls
 */

public class OutOfTime {

    @Test
    public void test() throws Exception {
	Timer timer = new Timer();
	timer.schedule(new ThrowTask(), 1);
	SECONDS.sleep(1);
	timer.schedule(new ThrowTask(), 1);
	SECONDS.sleep(5);
    }

}
