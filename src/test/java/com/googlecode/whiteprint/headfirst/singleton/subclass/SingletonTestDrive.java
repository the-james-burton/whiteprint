package com.googlecode.whiteprint.headfirst.singleton.subclass;

import org.junit.Test;

public class SingletonTestDrive {

    @Test
    public void test() {
	Singleton foo = CoolerSingleton.getInstance();
	Singleton bar = HotterSingleton.getInstance();
	System.out.println(foo);
	System.out.println(bar);
    }
}
