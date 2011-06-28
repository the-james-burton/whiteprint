package com.design.patterns.decorator.alldecorators;

class Espresso extends Decorator {
    private float  cost        = 0.75f;
    private String description = " espresso";

    public Espresso(DrinkComponent component) {
        super(component);
    }

    public float getTotalCost() {
        return component.getTotalCost() + cost;
    }

    public String getDescription() {
        return component.getDescription() + description;
    }
}