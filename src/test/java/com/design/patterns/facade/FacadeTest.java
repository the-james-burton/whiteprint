package com.design.patterns.facade;

import org.junit.Test;

public class FacadeTest {
    @Test
    public void test() {
	// The client programmer gets the objects by calling the static methods:
	final Facade facade = new Facade();
	final A a = facade.makeA(1);
	final B b = facade.makeB(1);
	final C c = facade.makeC(1.0);
    }
}