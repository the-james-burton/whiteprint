package com.design.patterns.facade;

import org.junit.Test;

public class FacadeTest {
    @Test
    public void test() {
	// The client programmer gets the objects by calling the static methods:
	final Facade facade = new Facade();
	facade.makeA(1);
	facade.makeB(1);
	facade.makeC(1.0);
    }
}