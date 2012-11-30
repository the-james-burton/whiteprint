package com.googlecode.whiteprint.tip.proxy;

import org.junit.Test;

public class ProxyTest {
    Proxy p = new Proxy();

    @Test
    public void test() {
	// This just makes sure it will complete without throwing an exception.
	this.p.f();
	this.p.g();
	this.p.h();
    }
}
