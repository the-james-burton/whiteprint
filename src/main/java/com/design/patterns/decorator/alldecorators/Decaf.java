package com.design.patterns.decorator.alldecorators;

class Decaf extends Decorator {
    private String description = " decaf";

    public Decaf(DrinkComponent component) {
        super(component);
    }

    public String getDescription() {
        return component.getDescription() + description;
    }
}