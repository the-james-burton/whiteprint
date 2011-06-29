package com.design.patterns.visitor;

import java.util.Random;

class FlowerGenerator {
  private static Random rand = new Random();
  public static Flower newFlower() {
    switch(rand.nextInt(3)) {
      default:
      case 0: return new Gladiolus();
      case 1: return new Runuculus();
      case 2: return new Chrysanthemum();
    }
  }
}