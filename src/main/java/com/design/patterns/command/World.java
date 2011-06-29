package com.design.patterns.command;

import java.util.logging.Logger;

class World implements Command {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Override
    public void execute() {
	log.info("World! ");
    }
}