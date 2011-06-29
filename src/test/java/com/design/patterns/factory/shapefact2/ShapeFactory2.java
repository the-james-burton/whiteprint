package com.design.patterns.factory.shapefact2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class ShapeFactory2 {
    String shlist[] = { "Circle", "Square", "Square", "Circle", "Circle", "Square" };
    List   shapes   = new ArrayList();

    @Test
    public void test() {
        // This just makes sure it will complete without throwing an exception.
        Iterator it = Arrays.asList(shlist).iterator();
        while (it.hasNext()) {
            shapes.add(ShapeFactory.createShape((String) it.next()));
        }
        it = shapes.iterator();
        while (it.hasNext()) {
            Shape s = (Shape) it.next();
            s.draw();
            s.erase();
        }
    }
}
