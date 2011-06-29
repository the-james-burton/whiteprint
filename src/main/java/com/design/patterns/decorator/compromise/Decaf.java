package com.design.patterns.decorator.compromise;

class Decaf extends Decorator {
    public Decaf(final DrinkComponent component) {
	super(component);
    }

    @Override
    public String getDescription() {
	return this.component.getDescription() + " decaf";
    }
}