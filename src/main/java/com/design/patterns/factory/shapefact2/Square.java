package com.design.patterns.factory.shapefact2;

class Square implements Shape {
    private Square() {
    }

    public void draw() {
        System.out.println("Square.draw");
    }

    public void erase() {
        System.out.println("Square.erase");
    }

    private static class Factory extends ShapeFactory {
        protected Shape create() {
            return new Square();
        }
    }

    static {
        ShapeFactory.addFactory("Square", new Factory());
    }
}