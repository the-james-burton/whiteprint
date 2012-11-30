package com.googlecode.whiteprint.tip.factory;

import java.util.logging.Logger;

class Puzzle implements Obstacle {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Override
    public void action() {
	log.info("Puzzle");
    }
}