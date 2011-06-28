package com.design.patterns.decorator.alldecorators;

class SteamedMilk extends Decorator {
    private float  cost        = 0.25f;
    private String description = " steamed milk";

    public SteamedMilk(DrinkComponent component) {
        super(component);
    }

    public float getTotalCost() {
        return component.getTotalCost() + cost;
    }

    public String getDescription() {
        return component.getDescription() + description;
    }
}