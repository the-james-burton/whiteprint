package com.design.patterns.decorator.compromise;

abstract class Decorator implements DrinkComponent {
    protected DrinkComponent component;

    public Decorator(DrinkComponent component) {
        this.component = component;
    }

    public float getTotalCost() {
        return component.getTotalCost();
    }

    public String getDescription() {
        return component.getDescription();
    }
}