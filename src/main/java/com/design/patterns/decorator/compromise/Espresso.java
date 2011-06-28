package com.design.patterns.decorator.compromise;

class Espresso implements DrinkComponent {
    private String description = "Espresso";
    private float  cost        = 0.75f;

    public float getTotalCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }
}