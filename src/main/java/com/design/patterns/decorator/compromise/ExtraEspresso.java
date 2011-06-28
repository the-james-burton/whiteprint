package com.design.patterns.decorator.compromise;

class ExtraEspresso extends Decorator {
    private float cost = 0.75f;

    public ExtraEspresso(DrinkComponent component) {
        super(component);
    }

    public String getDescription() {
        return component.getDescription() + " extra espresso";
    }

    public float getTotalCost() {
        return cost + component.getTotalCost();
    }
}