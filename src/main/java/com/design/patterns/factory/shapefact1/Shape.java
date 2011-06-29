package com.design.patterns.factory.shapefact1;

abstract class Shape {
    public abstract void draw();

    public abstract void erase();

    public static Shape factory(String type) {
        if (type.equals("Circle"))
            return new Circle();
        if (type.equals("Square"))
            return new Square();
        throw new RuntimeException("Bad shape creation: " + type);
    }
}