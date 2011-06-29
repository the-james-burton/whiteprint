package com.design.patterns.state;

import java.util.logging.Logger;

class Creature {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    private State state = new Frog();

    public void greet() {
	log.info(this.state.response());
    }

    public void kiss() {
	this.state = new Prince();
    }
}