package com.design.patterns.bridge;

class ClientService1 extends Abstraction {
  public ClientService1(Implementation imp) { super(imp); }
  public void serviceA() {
    service1();
    service2();
  }
  public void serviceB() {
    service3();
  }
}