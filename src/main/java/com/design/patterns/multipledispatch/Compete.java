package com.design.patterns.multipledispatch;

class Compete {
  public static void match(Item a, Item b) {
    System.out.println(
      a + " " + a.compete(b) + " vs. " + b);
  }
}