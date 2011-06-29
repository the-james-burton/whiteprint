package com.design.patterns.factory.shapefact2;

class Square implements Shape {
    private static class Factory extends ShapeFactory {
	@Override
	protected Shape create() {
	    return new Square();
	}
    }

    static {
	ShapeFactory.addFactory("Square", new Factory());
    }

    private Square() {
    }

    @Override
    public void draw() {
	System.out.println("Square.draw");
    }

    @Override
    public void erase() {
	System.out.println("Square.erase");
    }
}