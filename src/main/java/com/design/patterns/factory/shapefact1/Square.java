package com.design.patterns.factory.shapefact1;

class Square extends Shape {
    Square() {
    } // Package-access constructor

    @Override
    public void draw() {
	System.out.println("Square.draw");
    }

    @Override
    public void erase() {
	System.out.println("Square.erase");
    }
}