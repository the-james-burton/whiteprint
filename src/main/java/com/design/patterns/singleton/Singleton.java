package com.design.patterns.singleton;

final class Singleton {
  private static Singleton s = new Singleton(47);
  private int i;
  private Singleton(int x) { i = x; }
  public static Singleton getReference() { 
    return s; 
  }
  public int getValue() { return i; }
  public void setValue(int x) { i = x; }
}