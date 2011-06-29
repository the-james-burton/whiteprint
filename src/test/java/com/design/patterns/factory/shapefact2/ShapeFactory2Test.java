package com.design.patterns.factory.shapefact2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class ShapeFactory2Test {
    String shlist[] = { "Circle", "Square", "Square", "Circle", "Circle",
	    "Square" };
    List<Shape> shapes = new ArrayList<Shape>();

    @Test
    public void test() {
	// This just makes sure it will complete without throwing an exception.
	Iterator<?> it = Arrays.asList(this.shlist).iterator();
	while (it.hasNext()) {
	    this.shapes.add(ShapeFactory.createShape((String) it.next()));
	}
	it = this.shapes.iterator();
	while (it.hasNext()) {
	    final Shape s = (Shape) it.next();
	    s.draw();
	    s.erase();
	}
    }
}
