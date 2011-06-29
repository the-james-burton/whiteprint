package com.design.patterns.observer;

import java.util.Observable;

class Flower {
  private boolean isOpen;
  private OpenNotifier oNotify = 
    new OpenNotifier();
  private CloseNotifier cNotify = 
    new CloseNotifier();
  public Flower() { isOpen = false; }
  public void open() { // Opens its petals
    isOpen = true;
    oNotify.notifyObservers();
    cNotify.open();
  }
  public void close() { // Closes its petals
    isOpen = false;
    cNotify.notifyObservers();
    oNotify.close();
  }
  public Observable opening() { return oNotify; }
  public Observable closing() { return cNotify; }
  private class OpenNotifier extends Observable {
    private boolean alreadyOpen = false;
    public void notifyObservers() {
      if(isOpen && !alreadyOpen) {
        setChanged();
        super.notifyObservers();
        alreadyOpen = true;
      }
    }
    public void close() { alreadyOpen = false; }
  }
  private class CloseNotifier extends Observable{
    private boolean alreadyClosed = false;
    public void notifyObservers() {
      if(!isOpen && !alreadyClosed) {
        setChanged();
        super.notifyObservers();
        alreadyClosed = true;
      }
    }
    public void open() { alreadyClosed = false; }
  }
}