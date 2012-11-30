package com.googlecode.whiteprint.tip.bridge;

import java.util.logging.Logger;

class Library2 {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    public void operation1() {
	log.info("Library2.operation1()");
    }

    public void operation2() {
	log.info("Library2.operation2()");
    }

    public void operation3() {
	log.info("Library2.operation3()");
    }
}