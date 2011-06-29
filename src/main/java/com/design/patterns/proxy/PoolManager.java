package com.design.patterns.proxy;

import java.util.ArrayList;


public class PoolManager {
    private final ArrayList<PoolItem> items = new ArrayList<PoolItem>();

    public void add(final Object item) {
	this.items.add(new PoolItem(item));
    }

    public ReleasableReference get() {
	for (int i = 0; i < this.items.size(); i++) {
	    final PoolItem pitem = (PoolItem) this.items.get(i);
	    if (pitem.inUse == false) {
		pitem.inUse = true;
		return new ReleasableReference(pitem);
	    }
	}
	// Fail as soon as you try to cast it:
	// return new EmptyPoolItem();
	return null; // temporary
    }
}
