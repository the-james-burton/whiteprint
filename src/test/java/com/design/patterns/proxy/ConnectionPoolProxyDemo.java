package com.design.patterns.proxy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConnectionPoolProxyDemo {
    static {
        ConnectionPool.addConnections(5);
    }

    @Test
    public void test() {
        Connection c = ConnectionPool.getConnection();
        c.set(new Object());
        c.get();
        c.release();
    }

    @Test
    public void testDisable() {
        Connection c = ConnectionPool.getConnection();
        String s = null;
        c.set(new Object());
        c.get();
        c.release();
        try {
            c.get();
        } catch (Exception e) {
            s = e.getMessage();
            System.out.println(s);
        }
        assertEquals(s, "Tried to use reference after it was released");
    }
}