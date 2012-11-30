package com.googlecode.whiteprint.tip.decorator.compromise;

abstract class Decorator implements DrinkComponent {
    protected DrinkComponent component;

    public Decorator(final DrinkComponent component) {
	this.component = component;
    }

    @Override
    public String getDescription() {
	return this.component.getDescription();
    }

    @Override
    public float getTotalCost() {
	return this.component.getTotalCost();
    }
}