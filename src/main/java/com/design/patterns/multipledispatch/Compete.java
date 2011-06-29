package com.design.patterns.multipledispatch;

class Compete {
    public static void match(final Item a, final Item b) {
	System.out.println(a + " " + a.compete(b) + " vs. " + b);
    }
}