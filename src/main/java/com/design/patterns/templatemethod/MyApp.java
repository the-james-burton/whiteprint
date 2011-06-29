package com.design.patterns.templatemethod;

class MyApp extends ApplicationFramework {
  void customize1() { 
    System.out.print("Hello ");
  }
  void customize2() { 
    System.out.println("World!");
  }
}