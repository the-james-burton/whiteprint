package com.design.patterns.decorator.compromise;

class Dry extends Decorator {
    public Dry(final DrinkComponent component) {
	super(component);
    }

    @Override
    public String getDescription() {
	return this.component.getDescription() + " extra foamed milk";
    }
}