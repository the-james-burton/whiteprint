package com.googlecode.whiteprint.tip.proxy;

import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;

import org.junit.Test;

public class ConnectionPoolProxyTest {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    static {
	ConnectionPool.addConnections(5);
    }

    @Test
    public void test() {
	final Connection c = ConnectionPool.getConnection();
	c.set(new Object());
	c.get();
	c.release();
    }

    @Test
    public void testDisable() {
	final Connection c = ConnectionPool.getConnection();
	String s = null;
	c.set(new Object());
	c.get();
	c.release();
	try {
	    c.get();
	} catch (final Exception e) {
	    s = e.getMessage();
	    log.info(s);
	}
	assertEquals(s, "Tried to use reference after it was released");
    }
}