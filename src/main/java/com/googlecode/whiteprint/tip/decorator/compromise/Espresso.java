package com.googlecode.whiteprint.tip.decorator.compromise;

class Espresso implements DrinkComponent {
    private final String description = "Espresso";
    private final float cost = 0.75f;

    @Override
    public String getDescription() {
	return this.description;
    }

    @Override
    public float getTotalCost() {
	return this.cost;
    }
}