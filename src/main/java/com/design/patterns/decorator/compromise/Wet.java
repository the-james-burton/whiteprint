package com.design.patterns.decorator.compromise;

class Wet extends Decorator {
    public Wet(final DrinkComponent component) {
	super(component);
    }

    @Override
    public String getDescription() {
	return this.component.getDescription() + " extra steamed milk";
    }
}