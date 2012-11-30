package com.googlecode.whiteprint.tip.adapter.simple;

import org.junit.Test;

public class SimpleAdapterTest {
    Adaptee a = new Adaptee();
    Target t = new Adapter(this.a);

    @Test
    public void test() {
	this.t.request();
    }
}
