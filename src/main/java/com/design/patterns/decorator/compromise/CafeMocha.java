package com.design.patterns.decorator.compromise;

class CafeMocha implements DrinkComponent {
    private final float cost = 1.25f;
    private final String description = "Cafe Mocha";

    @Override
    public String getDescription() {
	return this.description;
    }

    @Override
    public float getTotalCost() {
	return this.cost;
    }
}