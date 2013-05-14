package com.googlecode.whiteprint.jcip.task;

import static java.util.concurrent.TimeUnit.SECONDS;

import java.util.Timer;
import java.util.TimerTask;

import org.junit.Assert;
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
    public void testOutOfTime() {
	
        try {
	    Timer timer = new Timer();
	    timer.schedule(new ThrowTask(), 1);
	    SECONDS.sleep(1);
	    timer.schedule(new ThrowTask(), 1);
	    SECONDS.sleep(5);
	} catch (Exception e) {
	    Assert.assertEquals("Timer already cancelled.", e.getMessage());
	}
    }

    static class ThrowTask extends TimerTask {
        public void run() {
            throw new RuntimeException();
        }
    }
}
