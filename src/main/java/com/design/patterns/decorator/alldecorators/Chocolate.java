package com.design.patterns.decorator.alldecorators;

class Chocolate extends Decorator {
    private float  cost        = 0.25f;
    private String description = " chocolate";

    public Chocolate(DrinkComponent component) {
        super(component);
    }

    public float getTotalCost() {
        return component.getTotalCost() + cost;
    }

    public String getDescription() {
        return component.getDescription() + description;
    }
}