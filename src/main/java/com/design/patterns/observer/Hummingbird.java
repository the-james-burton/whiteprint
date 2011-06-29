package com.design.patterns.observer;

import java.util.Observable;
import java.util.Observer;

class Hummingbird {
  private String name;
  private OpenObserver openObsrv = 
    new OpenObserver();
  private CloseObserver closeObsrv = 
    new CloseObserver();
  public Hummingbird(String nm) { name = nm; }
  private class OpenObserver implements Observer{
    public void update(Observable ob, Object a) {
      System.out.println("Hummingbird " + name 
        + "'s breakfast time!");
    }
  }
  private class CloseObserver implements Observer{
    public void update(Observable ob, Object a) {
      System.out.println("Hummingbird " + name 
        + "'s bed time!");
    }
  }
  public Observer openObserver() { 
    return openObsrv; 
  }
  public Observer closeObserver() { 
    return closeObsrv;
  }
}