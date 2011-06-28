package com.design.patterns.adapter;

import org.junit.Test;

public class SimpleAdapter {
    Adaptee a = new Adaptee();
    Target  t = new Adapter(a);

    @Test
    public void test() {
        t.request();
    }
}
