package com.design.patterns.decorator.alldecorators;

abstract class Decorator implements DrinkComponent {
    protected DrinkComponent component;

    Decorator(DrinkComponent component) {
        this.component = component;
    }

    public float getTotalCost() {
        return component.getTotalCost();
    }

    public abstract String getDescription();
}