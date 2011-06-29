package com.design.patterns.proxy;

class ConnectionPool { // A singleton
    private static PoolManager pool = new PoolManager();

    private ConnectionPool() {
    } // Prevent synthesized constructor

    public static void addConnections(int number) {
        for (int i = 0; i < number; i++)
            pool.add(new ConnectionImplementation());
    }

    public static Connection getConnection() {
        PoolManager.ReleasableReference rr = (PoolManager.ReleasableReference) pool.get();
        if (rr == null)
            return null;
        return new ConnectionProxy(rr);
    }

    // The proxy as a nested class:
    private static class ConnectionProxy implements Connection {
        private PoolManager.ReleasableReference implementation;

        public ConnectionProxy(PoolManager.ReleasableReference rr) {
            implementation = rr;
        }

        public Object get() {
            return ((Connection) implementation.getReference()).get();
        }

        public void set(Object x) {
            ((Connection) implementation.getReference()).set(x);
        }

        public void release() {
            implementation.release();
        }
    }
}