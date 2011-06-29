package com.design.patterns.bridge;

import java.util.logging.Logger;

class Library1 {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    public void method1() {
	log.info("Library1.method1()");
    }

    public void method2() {
	log.info("Library1.method2()");
    }
}