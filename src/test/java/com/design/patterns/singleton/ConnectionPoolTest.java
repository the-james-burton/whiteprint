package com.design.patterns.singleton;

import org.junit.Test;

public class ConnectionPoolTest {
    static {
	ConnectionPool.addConnections(5);
    }

    @Test
    public void test() {
	Connection c = null;
	try {
	    c = ConnectionPool.getConnection();
	} catch (final PoolManager.EmptyPoolException e) {
	    throw new RuntimeException(e);
	}
	c.set(new Object());
	c.get();
	ConnectionPool.releaseConnection(c);
    }

    @Test
    public void test2() {
	Connection c = null;
	try {
	    c = ConnectionPool.getConnection();
	} catch (final PoolManager.EmptyPoolException e) {
	    throw new RuntimeException(e);
	}
	c.set(new Object());
	c.get();
	ConnectionPool.releaseConnection(c);
    }
}
