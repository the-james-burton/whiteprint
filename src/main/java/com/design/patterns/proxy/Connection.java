package com.design.patterns.proxy;

interface Connection {
    Object get();

    void release();

    void set(Object x);
}