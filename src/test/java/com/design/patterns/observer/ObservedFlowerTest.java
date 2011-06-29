package com.design.patterns.observer;

import org.junit.Test;

public class ObservedFlowerTest {
    Flower f = new Flower();
    Bee ba = new Bee("A"), bb = new Bee("B");
    Hummingbird ha = new Hummingbird("A"), hb = new Hummingbird("B");

    @Test
    public void test() {
	this.f.opening().addObserver(this.ha.openObserver());
	this.f.opening().addObserver(this.hb.openObserver());
	this.f.opening().addObserver(this.ba.openObserver());
	this.f.opening().addObserver(this.bb.openObserver());
	this.f.closing().addObserver(this.ha.closeObserver());
	this.f.closing().addObserver(this.hb.closeObserver());
	this.f.closing().addObserver(this.ba.closeObserver());
	this.f.closing().addObserver(this.bb.closeObserver());
	// Hummingbird B decides to sleep in:
	this.f.opening().deleteObserver(this.hb.openObserver());
	// A change that interests observers:
	this.f.open();
	this.f.open(); // It's already open, no change.
	// Bee A doesn't want to go to bed:
	this.f.closing().deleteObserver(this.ba.closeObserver());
	this.f.close();
	this.f.close(); // It's already closed; no change
	this.f.opening().deleteObservers();
	this.f.open();
	this.f.close();
    }
}
