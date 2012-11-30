package com.googlecode.whiteprint.jcip.sharing.unsafe;

import org.junit.Test;

/**
 * NoVisibility
 * <p/>
 * Sharing variables without synchronization
 * 
 * @author Brian Goetz and Tim Peierls
 */

public class NoVisibility {

    @Test
    public void test() {
	new ReaderThread().start();
	ReaderThread.number = 42;
	ReaderThread.ready = true;
    }
}
