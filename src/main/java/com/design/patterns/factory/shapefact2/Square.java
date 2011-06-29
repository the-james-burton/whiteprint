package com.design.patterns.factory.shapefact2;

import java.util.logging.Logger;

class Square implements Shape {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    private static class Factory extends ShapeFactory {
	@Override
	protected Shape create() {
	    return new Square();
	}
    }

    static {
	ShapeFactory.addFactory("Square", new Factory());
    }

    private Square() {
    }

    @Override
    public void draw() {
	log.info("Square.draw");
    }

    @Override
    public void erase() {
	log.info("Square.erase");
    }
}