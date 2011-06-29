package com.design.patterns.proxy;

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