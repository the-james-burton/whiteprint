package com.design.patterns.bridge;

class Implementation1 implements Implementation {
  // Each facility delegates to a different library
  // in order to fulfill the obligations.
  private Library1 delegate = new Library1();
  public void facility1() {
    System.out.println("Implementation1.facility1");
    delegate.method1();
  }
  public void facility2() {
    System.out.println("Implementation1.facility2");
    delegate.method2();
  }
  public void facility3() {
    System.out.println("Implementation1.facility3");
    delegate.method2();
    delegate.method1();
  }
  public void facility4() {
    System.out.println("Implementation1.facility4");
    delegate.method1();
  }
}