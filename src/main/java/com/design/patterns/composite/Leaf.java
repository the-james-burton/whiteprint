package com.design.patterns.composite;

import java.util.logging.Logger;

class Leaf implements Component {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    private final String name;

    public Leaf(final String name) {
	this.name = name;
    }

    @Override
    public void operation() {
	log.info(this.toString());
    }

    @Override
    public String toString() {
	return this.name;
    }
}