package com.googlecode.whiteprint.tip.singleton;

import java.util.ArrayList;


public class PoolManager {
    private final ArrayList<PoolItem> items = new ArrayList<PoolItem>();

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
