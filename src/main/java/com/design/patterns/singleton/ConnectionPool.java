package com.design.patterns.singleton;

class ConnectionPool { // A singleton
  private static PoolManager pool = new PoolManager();
  public static void addConnections(int number) {
    for(int i = 0; i < number; i++)
      pool.add(new ConnectionImplementation());
  }
  public static Connection getConnection() 
  throws PoolManager.EmptyPoolException {
    return (Connection)pool.get();
  }
  public static void releaseConnection(Connection c) {
    pool.release(c);
  }
}