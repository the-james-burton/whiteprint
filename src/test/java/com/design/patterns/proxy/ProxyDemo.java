package com.design.patterns.proxy;

import org.junit.Test;

public class ProxyDemo {
    Proxy p = new Proxy();

    @Test
    public void test() {
        // This just makes sure it will complete without throwing an exception.
        p.f();
        p.g();
        p.h();
    }
}
