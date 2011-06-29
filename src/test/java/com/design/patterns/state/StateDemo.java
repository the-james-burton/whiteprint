package com.design.patterns.state;

import org.junit.Test;

public class StateDemo {
    static void run(ServiceProvider sp) {
        sp.service1();
        sp.service2();
        sp.service3();
    }

    ServiceProvider sp = new ServiceProvider(new Implementation1());

    @Test
    public void test() {
        run(sp);
        sp.changeState(new Implementation2());
        run(sp);
    }
}
