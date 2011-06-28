package com.design.patterns.decorator.compromise;

class Wet extends Decorator {
    public Wet(DrinkComponent component) {
        super(component);
    }

    public String getDescription() {
        return component.getDescription() + " extra steamed milk";
    }
}