package com.design.patterns.decorator.compromise;

class Dry extends Decorator {
    public Dry(DrinkComponent component) {
        super(component);
    }

    public String getDescription() {
        return component.getDescription() + " extra foamed milk";
    }
}