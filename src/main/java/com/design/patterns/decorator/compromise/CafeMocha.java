package com.design.patterns.decorator.compromise;

class CafeMocha implements DrinkComponent {
    private float  cost        = 1.25f;
    private String description = "Cafe Mocha";

    public float getTotalCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }
}