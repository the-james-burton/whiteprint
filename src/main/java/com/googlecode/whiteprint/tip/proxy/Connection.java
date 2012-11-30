package com.googlecode.whiteprint.tip.proxy;

interface Connection {
    Object get();

    void release();

    void set(Object x);
}