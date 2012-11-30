package com.googlecode.whiteprint.tip.decorator.alldecorators;

class FoamedMilk extends Decorator {
    private final float cost = 0.25f;
    private final String description = " foamed milk";

    public FoamedMilk(final DrinkComponent component) {
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