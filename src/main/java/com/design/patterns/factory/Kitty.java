package com.design.patterns.factory;

import java.util.logging.Logger;

class Kitty implements Player {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Override
    public void interactWith(final Obstacle ob) {
	log.info("Kitty has encountered a ");
	ob.action();
    }
}