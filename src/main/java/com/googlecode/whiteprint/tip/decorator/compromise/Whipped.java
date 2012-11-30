package com.googlecode.whiteprint.tip.decorator.compromise;

class Whipped extends Decorator {
    private final float cost = 0.50f;

    public Whipped(final DrinkComponent component) {
	super(component);
    }

    @Override
    public String getDescription() {
	return this.component.getDescription() + " whipped cream";
    }

    @Override
    public float getTotalCost() {
	return this.cost + this.component.getTotalCost();
    }
}