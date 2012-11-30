package com.googlecode.whiteprint.tip.visitor;

import java.util.logging.Logger;

class Bee implements Visitor {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Override
    public void visit(final Chrysanthemum c) {
	log.info("Bee and Chrysanthemum");
    }

    @Override
    public void visit(final Gladiolus g) {
	log.info("Bee and Gladiolus");
    }

    @Override
    public void visit(final Runuculus r) {
	log.info("Bee and Runuculus");
    }
}