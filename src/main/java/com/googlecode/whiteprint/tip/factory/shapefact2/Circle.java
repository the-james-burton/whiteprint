package com.googlecode.whiteprint.tip.factory.shapefact2;

import java.util.logging.Logger;

class Circle implements Shape {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    private static class Factory extends ShapeFactory {
	@Override
	protected Shape create() {
	    return new Circle();
	}
    }

    static {
	ShapeFactory.addFactory("Circle", new Factory());
    }

    private Circle() {
    }

    @Override
    public void draw() {
	log.info("Circle.draw");
    }

    @Override
    public void erase() {
	log.info("Circle.erase");
    }
}