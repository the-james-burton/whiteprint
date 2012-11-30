package com.googlecode.whiteprint.tip.decorator.compromise;

class CafeLatte implements DrinkComponent {
    private final float cost = 1;
    private final String description = "Cafe Late";

    @Override
    public String getDescription() {
	return this.description;
    }

    @Override
    public float getTotalCost() {
	return this.cost;
    }
}