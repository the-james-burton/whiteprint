package com.design.patterns.factory.shapefact1;

class Square extends Shape {
    Square() {
    } // Package-access constructor

    @Override
    public void draw() {
	log.info("Square.draw");
    }

    @Override
    public void erase() {
	log.info("Square.erase");
    }
}