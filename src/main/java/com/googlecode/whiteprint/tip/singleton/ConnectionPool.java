package com.googlecode.whiteprint.tip.singleton;

class ConnectionPool { // A singleton
    private static PoolManager pool = new PoolManager();

    public static void addConnections(final int number) {
	for (int i = 0; i < number; i++) {
	    pool.add(new ConnectionImplementation());
	}
    }

    public static Connection getConnection()
	    throws EmptyPoolException {
	return (Connection) pool.get();
    }

    public static void releaseConnection(final Connection c) {
	pool.release(c);
    }
}