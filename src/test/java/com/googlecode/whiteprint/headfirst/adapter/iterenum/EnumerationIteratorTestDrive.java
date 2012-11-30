package com.googlecode.whiteprint.headfirst.adapter.iterenum;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

import org.junit.Test;

public class EnumerationIteratorTestDrive {

    String[] args = { "one", "two", "three" };

    @Test
    public void test() {
	Vector v = new Vector(Arrays.asList(args));
	Iterator iterator = new EnumerationIterator(v.elements());
	while (iterator.hasNext()) {
	    System.out.println(iterator.next());
	}
    }
}
