package com.design.patterns.decorator.alldecorators;

class SteamedMilk extends Decorator {
    private final float cost = 0.25f;
    private final String description = " steamed milk";

    public SteamedMilk(final DrinkComponent component) {
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