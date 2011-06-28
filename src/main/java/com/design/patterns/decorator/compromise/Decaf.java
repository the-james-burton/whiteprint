package com.design.patterns.decorator.compromise;

class Decaf extends Decorator {
    public Decaf(DrinkComponent component) {
        super(component);
    }

    public String getDescription() {
        return component.getDescription() + " decaf";
    }
}