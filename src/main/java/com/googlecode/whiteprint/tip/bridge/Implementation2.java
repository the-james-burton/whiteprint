package com.googlecode.whiteprint.tip.bridge;

import java.util.logging.Logger;

class Implementation2 implements Implementation {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    private final Library2 delegate = new Library2();

    @Override
    public void facility1() {
	log.info("Implementation2.facility1");
	this.delegate.operation1();
    }

    @Override
    public void facility2() {
	log.info("Implementation2.facility2");
	this.delegate.operation2();
    }

    @Override
    public void facility3() {
	log.info("Implementation2.facility3");
	this.delegate.operation3();
    }

    @Override
    public void facility4() {
	log.info("Implementation2.facility4");
	this.delegate.operation1();
    }
}