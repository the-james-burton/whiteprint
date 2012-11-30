package com.googlecode.whiteprint.tip.bridge;

import java.util.logging.Logger;

class Implementation1 implements Implementation {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    // Each facility delegates to a different library
    // in order to fulfill the obligations.
    private final Library1 delegate = new Library1();

    @Override
    public void facility1() {
	log.info("Implementation1.facility1");
	this.delegate.method1();
    }

    @Override
    public void facility2() {
	log.info("Implementation1.facility2");
	this.delegate.method2();
    }

    @Override
    public void facility3() {
	log.info("Implementation1.facility3");
	this.delegate.method2();
	this.delegate.method1();
    }

    @Override
    public void facility4() {
	log.info("Implementation1.facility4");
	this.delegate.method1();
    }
}