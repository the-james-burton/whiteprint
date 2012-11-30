package com.googlecode.whiteprint.tip.decorator.alldecorators;

class Mug implements DrinkComponent {
    @Override
    public String getDescription() {
	return "mug";
    }

    @Override
    public float getTotalCost() {
	return 0;
    }
}