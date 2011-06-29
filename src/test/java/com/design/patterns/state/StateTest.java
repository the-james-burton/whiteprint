package com.design.patterns.state;

import org.junit.Test;

public class StateTest {
    static void run(final ServiceProvider sp) {
	sp.service1();
	sp.service2();
	sp.service3();
    }

    ServiceProvider sp = new ServiceProvider(new Implementation1());

    @Test
    public void test() {
	run(this.sp);
	this.sp.changeState(new Implementation2());
	run(this.sp);
    }
}
