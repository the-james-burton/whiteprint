package com.design.patterns.observer;

import org.junit.Test;

public class ObservedFlowerTest {
    Flower f = new Flower();
    Bee    ba = new Bee("A"), bb = new Bee("B");
    Hummingbird ha = new Hummingbird("A"), hb = new Hummingbird("B");

    @Test
    public void test() {
        f.opening().addObserver(ha.openObserver());
        f.opening().addObserver(hb.openObserver());
        f.opening().addObserver(ba.openObserver());
        f.opening().addObserver(bb.openObserver());
        f.closing().addObserver(ha.closeObserver());
        f.closing().addObserver(hb.closeObserver());
        f.closing().addObserver(ba.closeObserver());
        f.closing().addObserver(bb.closeObserver());
        // Hummingbird B decides to sleep in:
        f.opening().deleteObserver(hb.openObserver());
        // A change that interests observers:
        f.open();
        f.open(); // It's already open, no change.
        // Bee A doesn't want to go to bed:
        f.closing().deleteObserver(ba.closeObserver());
        f.close();
        f.close(); // It's already closed; no change
        f.opening().deleteObservers();
        f.open();
        f.close();
    }
}
