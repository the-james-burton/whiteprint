package com.design.patterns.decorator.compromise;

class Whipped extends Decorator {
    private float cost = 0.50f;

    public Whipped(DrinkComponent component) {
        super(component);
    }

    public float getTotalCost() {
        return cost + component.getTotalCost();
    }

    public String getDescription() {
        return component.getDescription() + " whipped cream";
    }
}