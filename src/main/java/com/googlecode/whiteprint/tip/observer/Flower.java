package com.googlecode.whiteprint.tip.observer;

import java.util.Observable;

class Flower {
    private class CloseNotifier extends Observable {
	private boolean alreadyClosed = false;

	@Override
	public void notifyObservers() {
	    if (!Flower.this.isOpen && !this.alreadyClosed) {
		setChanged();
		super.notifyObservers();
		this.alreadyClosed = true;
	    }
	}

	public void open() {
	    this.alreadyClosed = false;
	}
    }

    private class OpenNotifier extends Observable {
	private boolean alreadyOpen = false;

	public void close() {
	    this.alreadyOpen = false;
	}

	@Override
	public void notifyObservers() {
	    if (Flower.this.isOpen && !this.alreadyOpen) {
		setChanged();
		super.notifyObservers();
		this.alreadyOpen = true;
	    }
	}
    }

    private boolean isOpen;

    private final OpenNotifier oNotify = new OpenNotifier();

    private final CloseNotifier cNotify = new CloseNotifier();

    public Flower() {
	this.isOpen = false;
    }

    public void close() { // Closes its petals
	this.isOpen = false;
	this.cNotify.notifyObservers();
	this.oNotify.close();
    }

    public Observable closing() {
	return this.cNotify;
    }

    public void open() { // Opens its petals
	this.isOpen = true;
	this.oNotify.notifyObservers();
	this.cNotify.open();
    }

    public Observable opening() {
	return this.oNotify;
    }
}