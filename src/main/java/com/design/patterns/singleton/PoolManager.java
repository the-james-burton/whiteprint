package com.design.patterns.singleton;

import java.util.ArrayList;

public class PoolManager {
    static class EmptyPoolException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1700207749242732367L;
    }

    private static class PoolItem {
	boolean inUse = false;
	Object item;

	PoolItem(final Object item) {
	    this.item = item;
	}
    }

    private final ArrayList items = new ArrayList();

    public void add(final Object item) {
	this.items.add(new PoolItem(item));
    }

    public Object get() throws EmptyPoolException {
	for (int i = 0; i < this.items.size(); i++) {
	    final PoolItem pitem = (PoolItem) this.items.get(i);
	    if (pitem.inUse == false) {
		pitem.inUse = true;
		return pitem.item;
	    }
	}
	// Fail early:
	throw new EmptyPoolException();
	// return null; // Delayed failure
    }

    public void release(final Object item) {
	for (int i = 0; i < this.items.size(); i++) {
	    final PoolItem pitem = (PoolItem) this.items.get(i);
	    if (item == pitem.item) {
		pitem.inUse = false;
		return;
	    }
	}
	throw new RuntimeException(item + " not found");
    }
}
