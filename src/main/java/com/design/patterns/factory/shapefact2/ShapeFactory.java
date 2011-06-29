package com.design.patterns.factory.shapefact2;

import java.util.HashMap;
import java.util.Map;

abstract class ShapeFactory {
    protected abstract Shape create();

    private static Map factories = new HashMap();

    public static void addFactory(String id, ShapeFactory f) {
	factories.put(id, f);
    }

    // A Template Method:
    public static final Shape createShape(String id) {
	if (!factories.containsKey(id)) {
	    try {
		// Load dynamically
		Class.forName("com.design.patterns.factory.shapefact2." + id);
	    } catch (ClassNotFoundException e) {
		throw new RuntimeException("Bad shape creation: " + id);
	    }
	    // See if it was put in:
	    if (!factories.containsKey(id)) {
		throw new RuntimeException("Bad shape creation: " + id);
	    }
	}
	return ((ShapeFactory) factories.get(id)).create();
    }
}