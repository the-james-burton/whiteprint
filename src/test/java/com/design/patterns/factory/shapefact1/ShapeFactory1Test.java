package com.design.patterns.factory.shapefact1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ShapeFactory1Test {
    List<String> shlist =  Arrays.asList(new String[]{ "Circle", "Square", "Square", "Circle", "Circle",
    "Square" });
    List<Shape> shapes = new ArrayList<Shape>();

    @Test
    public void test() {
	for (String shape : this.shlist) {
	    this.shapes.add(Shape.factory(shape));
	}
	for (Shape shape : shapes) {
	    shape.draw();
	    shape.erase();
	}
    }
}
