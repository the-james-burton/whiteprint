package com.design.patterns.factory.shapefact1;

class Circle extends Shape {
    Circle() {
    } // Package-access constructor

    public void draw() {
        System.out.println("Circle.draw");
    }

    public void erase() {
        System.out.println("Circle.erase");
    }
}