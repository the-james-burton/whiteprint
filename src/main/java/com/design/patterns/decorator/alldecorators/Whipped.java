package com.design.patterns.decorator.alldecorators;

class Whipped extends Decorator {
    private float  cost        = 0.25f;
    private String description = " whipped cream";

    public Whipped(DrinkComponent component) {
        super(component);
    }

    public float getTotalCost() {
        return component.getTotalCost() + cost;
    }

    public String getDescription() {
        return component.getDescription() + description;
    }
}