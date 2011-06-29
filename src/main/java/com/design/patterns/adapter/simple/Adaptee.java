package com.design.patterns.adapter.simple;

import java.util.logging.Logger;

class Adaptee {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    public void specificRequest() {
	log.info("Adaptee: SpecificRequest");
    }
}