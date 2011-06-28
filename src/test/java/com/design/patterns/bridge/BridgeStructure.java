// : bridge:BridgeStructure.java
// A demonstration of the structure and operation
// of the Bridge Pattern.
package com.design.patterns.bridge;

import org.junit.Test;

public class BridgeStructure {
    @Test
    public void test1() {
        // Here, the implementation is determined by
        // the client at creation time:
        ClientService1 cs1 = new ClientService1(new Implementation1());
        cs1.serviceA();
        cs1.serviceB();
    }

    @Test
    public void test2() {
        ClientService1 cs1 = new ClientService1(new Implementation2());
        cs1.serviceA();
        cs1.serviceB();
    }

    @Test
    public void test3() {
        ClientService2 cs2 = new ClientService2(new Implementation1());
        cs2.serviceC();
        cs2.serviceD();
        cs2.serviceE();
    }

    @Test
    public void test4() {
        ClientService2 cs2 = new ClientService2(new Implementation2());
        cs2.serviceC();
        cs2.serviceD();
        cs2.serviceE();
    }
}
