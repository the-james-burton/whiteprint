package com.googlecode.whiteprint.tip.proxy;

class ConnectionPool { // A singleton
    // The proxy as a nested class:
    private static class ConnectionProxy implements Connection {
	private final ReleasableReference implementation;

	public ConnectionProxy(final ReleasableReference rr) {
	    this.implementation = rr;
	}

	@Override
	public Object get() {
	    return ((Connection) this.implementation.getReference()).get();
	}

	@Override
	public void release() {
	    this.implementation.release();
	}

	@Override
	public void set(final Object x) {
	    ((Connection) this.implementation.getReference()).set(x);
	}
    }

    private static PoolManager pool = new PoolManager();

    public static void addConnections(final int number) {
	for (int i = 0; i < number; i++) {
	    pool.add(new ConnectionImplementation());
	}
    }

    public static Connection getConnection() {
	final ReleasableReference rr = pool.get();
	if (rr == null) {
	    return null;
	}
	return new ConnectionProxy(rr);
    }

    private ConnectionPool() {
    } // Prevent synthesized constructor
}