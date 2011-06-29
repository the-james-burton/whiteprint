package com.design.patterns.proxy;

import java.util.ArrayList;

public class PoolManager {
    // Different (better?) approach to running out of items:
    public static class EmptyPoolItem {
    }

    private static class PoolItem {
	boolean inUse = false;
	Object item;

	PoolItem(final Object item) {
	    this.item = item;
	}
    }

    public class ReleasableReference { // Used to build the proxy
	private final PoolItem reference;
	private boolean released = false;

	public ReleasableReference(final PoolItem reference) {
	    this.reference = reference;
	}

	public Object getReference() {
	    if (this.released) {
		throw new RuntimeException(
			"Tried to use reference after it was released");
	    }
	    return this.reference.item;
	}

	public void release() {
	    this.released = true;
	    this.reference.inUse = false;
	}
    }

    private final ArrayList items = new ArrayList();

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
