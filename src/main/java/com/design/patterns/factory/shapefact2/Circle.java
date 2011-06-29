package com.design.patterns.factory.shapefact2;

class Circle implements Shape {
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
	System.out.println("Circle.draw");
    }

    @Override
    public void erase() {
	System.out.println("Circle.erase");
    }
}