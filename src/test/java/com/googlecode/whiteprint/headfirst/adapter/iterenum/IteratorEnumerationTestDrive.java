package com.googlecode.whiteprint.headfirst.adapter.iterenum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

import org.junit.Test;

public class IteratorEnumerationTestDrive {

    String[] args = { "one", "two", "three" };

    @Test
    public void test() {
	ArrayList l = new ArrayList(Arrays.asList(args));
	Enumeration enumeration = new IteratorEnumeration(l.iterator());
	while (enumeration.hasMoreElements()) {
	    System.out.println(enumeration.nextElement());
	}
    }
}
