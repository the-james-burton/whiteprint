package com.design.patterns.decorator.alldecorators;

class Espresso extends Decorator {
    private final float cost = 0.75f;
    private final String description = " espresso";

    public Espresso(final DrinkComponent component) {
	super(component);
    }

    @Override
    public String getDescription() {
	return this.component.getDescription() + this.description;
    }

    @Override
    public float getTotalCost() {
	return this.component.getTotalCost() + this.cost;
    }
}