package com.design.patterns.proxy;

class Proxy implements ProxyBase {
    private final ProxyBase implementation;

    public Proxy() {
	this.implementation = new Implementation();
    }

    // Pass method calls to the implementation:
    @Override
    public void f() {
	this.implementation.f();
    }

    @Override
    public void g() {
	this.implementation.g();
    }

    @Override
    public void h() {
	this.implementation.h();
    }
}