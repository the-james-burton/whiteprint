package com.design.patterns.facade;

import org.junit.Test;

public class FacadeTest {
    @Test
    public void test() {
        // The client programmer gets the objects by calling the static methods:
        Facade facade = new Facade();
        A a = facade.makeA(1);
        B b = facade.makeB(1);
        C c = facade.makeC(1.0);
    }
}