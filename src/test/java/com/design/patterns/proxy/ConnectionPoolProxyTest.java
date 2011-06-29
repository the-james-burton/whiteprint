package com.design.patterns.proxy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConnectionPoolProxyTest {
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
	    System.out.println(s);
	}
	assertEquals(s, "Tried to use reference after it was released");
    }
}