package com.design.patterns.factory.shapefact1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class ShapeFactory1 {
    String shlist[] = { "Circle", "Square", "Square", "Circle", "Circle", "Square" };
    List   shapes   = new ArrayList();

    @Test
    public void test() {
        Iterator it = Arrays.asList(shlist).iterator();
        while (it.hasNext()) {
            shapes.add(Shape.factory((String) it.next()));
        }
        it = shapes.iterator();
        while (it.hasNext()) {
            Shape s = (Shape) it.next();
            s.draw();
            s.erase();
        }
    }
}
