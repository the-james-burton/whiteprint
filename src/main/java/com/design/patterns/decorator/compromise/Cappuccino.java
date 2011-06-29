package com.design.patterns.decorator.compromise;

class Cappuccino implements DrinkComponent {
    private final float cost = 1;
    private final String description = "Cappuccino";

    @Override
    public String getDescription() {
	return this.description;
    }

    @Override
    public float getTotalCost() {
	return this.cost;
    }
}