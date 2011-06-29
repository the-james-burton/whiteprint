package com.design.patterns.factory.shapefact2;

class Circle implements Shape {
    private Circle() {
    }

    public void draw() {
        System.out.println("Circle.draw");
    }

    public void erase() {
        System.out.println("Circle.erase");
    }

    private static class Factory extends ShapeFactory {
        protected Shape create() {
            return new Circle();
        }
    }

    static {
        ShapeFactory.addFactory("Circle", new Factory());
    }
}