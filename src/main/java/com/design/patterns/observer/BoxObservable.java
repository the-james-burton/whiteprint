package com.design.patterns.observer;

import java.util.Observable;

class BoxObservable extends Observable {
    @Override
    public void notifyObservers(final Object b) {
	// Otherwise it won't propagate changes:
	setChanged();
	super.notifyObservers(b);
    }
}