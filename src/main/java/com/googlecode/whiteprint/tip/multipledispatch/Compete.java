package com.googlecode.whiteprint.tip.multipledispatch;

import java.util.logging.Logger;

class Compete {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    public void match(final Item a, final Item b) {
	log.info(a + " " + a.compete(b) + " vs. " + b);
    }
}