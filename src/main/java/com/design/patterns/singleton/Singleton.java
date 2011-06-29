package com.design.patterns.singleton;

final class Singleton {
    private static Singleton s = new Singleton(47);

    public static Singleton getReference() {
	return s;
    }

    private int i;

    private Singleton(final int x) {
	this.i = x;
    }

    public int getValue() {
	return this.i;
    }

    public void setValue(final int x) {
	this.i = x;
    }
}