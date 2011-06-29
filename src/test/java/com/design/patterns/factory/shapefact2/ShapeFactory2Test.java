package com.design.patterns.factory.shapefact2;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ShapeFactory2Test {
    String shlist[] = { "Circle", "Square", "Square", "Circle", "Circle",
	    "Square" };
    List<Shape> shapes = new ArrayList<Shape>();

    @Test
    public void test() {
	for (String shape : this.shlist) {
	    this.shapes.add(ShapeFactory.createShape(shape));
	}
	for (Shape shape : shapes) {
	    shape.draw();
	    shape.erase();
	}
    }

}
