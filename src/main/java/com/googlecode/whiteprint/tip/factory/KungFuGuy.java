package com.googlecode.whiteprint.tip.factory;

import java.util.logging.Logger;

class KungFuGuy implements Player {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Override
    public void interactWith(final Obstacle ob) {
	log.info("KungFuGuy now battles a ");
	ob.action();
    }
}