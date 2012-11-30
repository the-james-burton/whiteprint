package com.googlecode.whiteprint.tip.proxy;

class ConnectionImplementation implements Connection {
    @Override
    public Object get() {
	return null;
    }

    @Override
    public void release() {
    } // Never called directly

    @Override
    public void set(final Object s) {
    }
}