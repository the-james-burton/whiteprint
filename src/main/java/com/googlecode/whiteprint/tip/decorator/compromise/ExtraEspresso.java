package com.googlecode.whiteprint.tip.decorator.compromise;

class ExtraEspresso extends Decorator {
    private final float cost = 0.75f;

    public ExtraEspresso(final DrinkComponent component) {
	super(component);
    }

    @Override
    public String getDescription() {
	return this.component.getDescription() + " extra espresso";
    }

    @Override
    public float getTotalCost() {
	return this.cost + this.component.getTotalCost();
    }
}