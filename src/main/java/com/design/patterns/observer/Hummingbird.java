package com.design.patterns.observer;

import java.util.Observable;
import java.util.Observer;

class Hummingbird {
    private class CloseObserver implements Observer {
	@Override
	public void update(final Observable ob, final Object a) {
	    System.out.println("Hummingbird " + Hummingbird.this.name
		    + "'s bed time!");
	}
    }

    private class OpenObserver implements Observer {
	@Override
	public void update(final Observable ob, final Object a) {
	    System.out.println("Hummingbird " + Hummingbird.this.name
		    + "'s breakfast time!");
	}
    }

    private final String name;

    private final OpenObserver openObsrv = new OpenObserver();

    private final CloseObserver closeObsrv = new CloseObserver();

    public Hummingbird(final String nm) {
	this.name = nm;
    }

    public Observer closeObserver() {
	return this.closeObsrv;
    }

    public Observer openObserver() {
	return this.openObsrv;
    }
}