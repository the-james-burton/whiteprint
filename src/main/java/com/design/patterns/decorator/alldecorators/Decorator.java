package com.design.patterns.decorator.alldecorators;

abstract class Decorator implements DrinkComponent {
    protected DrinkComponent component;

    Decorator(final DrinkComponent component) {
	this.component = component;
    }

    @Override
    public abstract String getDescription();

    @Override
    public float getTotalCost() {
	return this.component.getTotalCost();
    }
}