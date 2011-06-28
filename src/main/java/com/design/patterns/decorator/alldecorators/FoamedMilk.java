package com.design.patterns.decorator.alldecorators;

class FoamedMilk extends Decorator {
    private float  cost        = 0.25f;
    private String description = " foamed milk";

    public FoamedMilk(DrinkComponent component) {
        super(component);
    }

    public float getTotalCost() {
        return component.getTotalCost() + cost;
    }

    public String getDescription() {
        return component.getDescription() + description;
    }
}