package com.design.patterns.bridge;

class ClientService2 extends Abstraction {
  public ClientService2(Implementation imp) { super(imp); }
  public void serviceC() {
    service2();
    service3();
  }
  public void serviceD() {
    service1();
    service3();
  }
  public void serviceE() {
    getImplementation().facility3();
  }
}