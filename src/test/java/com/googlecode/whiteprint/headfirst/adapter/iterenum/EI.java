package com.googlecode.whiteprint.headfirst.adapter.iterenum;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import org.junit.Test;

public class EI {

    String[] args = { "one", "two", "three" };

    @Test
    public void test() {
	Vector v = new Vector(Arrays.asList(args));
	Enumeration enumeration = v.elements();
	while (enumeration.hasMoreElements()) {
	    System.out.println(enumeration.nextElement());
	}
	Iterator iterator = v.iterator();
	while (iterator.hasNext()) {
	    System.out.println(iterator.next());
	}
    }
}
