package com.design.patterns.proxy;

class ConnectionImplementation implements Connection {
    public Object get() {
        return null;
    }

    public void set(Object s) {
    }

    public void release() {
    } // Never called directly
}