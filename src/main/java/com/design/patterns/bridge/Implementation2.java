package com.design.patterns.bridge;

class Implementation2 implements Implementation {
  private Library2 delegate = new Library2();
  public void facility1() {
    System.out.println("Implementation2.facility1");
    delegate.operation1();
  }
  public void facility2() {
    System.out.println("Implementation2.facility2");
    delegate.operation2();
  }
  public void facility3() {
    System.out.println("Implementation2.facility3");
    delegate.operation3();
  }
  public void facility4() {
    System.out.println("Implementation2.facility4");
    delegate.operation1();
  }
}