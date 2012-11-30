package com.googlecode.whiteprint.tip.factory.shapefact1;

class Circle extends Shape {
    Circle() {
    } // Package-access constructor

    @Override
    public void draw() {
	log.info("Circle.draw");
    }

    @Override
    public void erase() {
	log.info("Circle.erase");
    }
}