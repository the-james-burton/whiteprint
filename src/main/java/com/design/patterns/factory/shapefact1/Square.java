package com.design.patterns.factory.shapefact1;

class Square extends Shape {
    Square() {
    } // Package-access constructor

    public void draw() {
        System.out.println("Square.draw");
    }

    public void erase() {
        System.out.println("Square.erase");
    }
}