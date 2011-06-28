package com.design.patterns.decorator.compromise;

class EspressoConPanna implements DrinkComponent {
    private String description = "EspressoConPare";
    private float  cost        = 1;

    public float getTotalCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }
}