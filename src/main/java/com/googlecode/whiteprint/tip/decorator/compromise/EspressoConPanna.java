package com.googlecode.whiteprint.tip.decorator.compromise;

class EspressoConPanna implements DrinkComponent {
    private final String description = "EspressoConPare";
    private final float cost = 1;

    @Override
    public String getDescription() {
	return this.description;
    }

    @Override
    public float getTotalCost() {
	return this.cost;
    }
}