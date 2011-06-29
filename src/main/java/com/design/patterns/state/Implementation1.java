package com.design.patterns.state;

import java.util.logging.Logger;

class Implementation1 implements State2 {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Override
    public void operation1() {
	log.info("Implementation1.operation1()");
    }

    @Override
    public void operation2() {
	log.info("Implementation1.operation2()");
    }

    @Override
    public void operation3() {
	log.info("Implementation1.operation3()");
    }
}