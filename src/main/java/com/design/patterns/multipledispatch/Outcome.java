package com.design.patterns.multipledispatch;

class Outcome {
    private final String name;

    public final static Outcome WIN = new Outcome("wins"), LOSE = new Outcome(
	    "loses"), DRAW = new Outcome("draws");

    private Outcome(final String name) {
	this.name = name;
    }

    @Override
    public String toString() {
	return this.name;
    }
}