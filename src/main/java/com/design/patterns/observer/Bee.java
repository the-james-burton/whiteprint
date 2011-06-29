package com.design.patterns.observer;

import java.util.Observable;
import java.util.Observer;

class Bee {
    // Another inner class for closings:
    private class CloseObserver implements Observer {
	@Override
	public void update(final Observable ob, final Object a) {
	    System.out.println("Bee " + Bee.this.name + "'s bed time!");
	}
    }

    // An inner class for observing openings:
    private class OpenObserver implements Observer {
	@Override
	public void update(final Observable ob, final Object a) {
	    System.out.println("Bee " + Bee.this.name + "'s breakfast time!");
	}
    }

    private final String name;

    private final OpenObserver openObsrv = new OpenObserver();

    private final CloseObserver closeObsrv = new CloseObserver();

    public Bee(final String nm) {
	this.name = nm;
    }

    public Observer closeObserver() {
	return this.closeObsrv;
    }

    public Observer openObserver() {
	return this.openObsrv;
    }
}