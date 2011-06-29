package com.design.patterns.state;

import java.util.logging.Logger;

public class Beast {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    private boolean isFrog = true;

    public void greet() {
	if (this.isFrog) {
	    log.info("Ribbet!");
	} else {
	    log.info("Darling!");
	}
    }

    public void kiss() {
	this.isFrog = false;
    }
}
