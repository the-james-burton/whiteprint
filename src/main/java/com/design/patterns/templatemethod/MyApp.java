package com.design.patterns.templatemethod;

class MyApp extends ApplicationFramework {

    @Override
    void customize1() {
	log.info("Hello ");
    }

    @Override
    void customize2() {
	log.info("World!");
    }
}