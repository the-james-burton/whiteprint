package com.googlecode.whiteprint.tip.observer;

import java.util.Observable;
import java.util.Observer;
import java.util.logging.Logger;

class Hummingbird {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    private class CloseObserver implements Observer {
	@Override
	public void update(final Observable ob, final Object a) {
	    log.info("Hummingbird " + Hummingbird.this.name + "'s bed time!");
	}
    }

    private class OpenObserver implements Observer {
	@Override
	public void update(final Observable ob, final Object a) {
	    log.info("Hummingbird " + Hummingbird.this.name
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