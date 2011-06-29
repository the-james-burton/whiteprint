package com.design.patterns.decorator.alldecorators;

import org.junit.Test;

public class CoffeeShopAllDecoratorTest {
    @Test
    public void testCafeMocha() {
	// This just makes sure it will complete without throwing an exception.
	// Create a decaf cafe mocha with whipped cream
	final DrinkComponent cafeMocha = new Espresso(new SteamedMilk(
		new Chocolate(new Whipped(new Decaf(new Mug())))));
	System.out.println(cafeMocha.getDescription().trim() + ": $"
		+ cafeMocha.getTotalCost());
    }

    @Test
    public void testCappuccino() {
	// This just makes sure it will complete without throwing an exception.
	// Create a plain cappucino
	final DrinkComponent cappuccino = new Espresso(
		new FoamedMilk(new Mug()));
	System.out.println(cappuccino.getDescription().trim() + ": $"
		+ cappuccino.getTotalCost());
    }
}