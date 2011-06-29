package com.design.patterns.templatemethod;

import java.util.logging.Logger;

class MyApp extends ApplicationFramework {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Override
    void customize1() {
	log.info("Hello ");
    }

    @Override
    void customize2() {
	log.info("World!");
    }
}