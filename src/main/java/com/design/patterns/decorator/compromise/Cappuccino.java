package com.design.patterns.decorator.compromise;

class Cappuccino implements DrinkComponent {
    private float  cost        = 1;
    private String description = "Cappuccino";

    public float getTotalCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }
}