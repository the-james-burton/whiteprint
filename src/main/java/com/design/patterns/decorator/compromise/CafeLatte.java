package com.design.patterns.decorator.compromise;

class CafeLatte implements DrinkComponent {
    private float  cost        = 1;
    private String description = "Cafe Late";

    public float getTotalCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }
}