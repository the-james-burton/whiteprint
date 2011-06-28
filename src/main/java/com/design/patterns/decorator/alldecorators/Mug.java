package com.design.patterns.decorator.alldecorators;

class Mug implements DrinkComponent {
    public String getDescription() {
        return "mug";
    }

    public float getTotalCost() {
        return 0;
    }
}