package com.googlecode.whiteprint.tip.decorator.alldecorators;

class Chocolate extends Decorator {
    private final float cost = 0.25f;
    private final String description = " chocolate";

    public Chocolate(final DrinkComponent component) {
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