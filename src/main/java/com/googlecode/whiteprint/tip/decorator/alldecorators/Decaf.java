package com.googlecode.whiteprint.tip.decorator.alldecorators;

class Decaf extends Decorator {
    private final String description = " decaf";

    public Decaf(final DrinkComponent component) {
	super(component);
    }

    @Override
    public String getDescription() {
	return this.component.getDescription() + this.description;
    }
}