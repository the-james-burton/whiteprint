package com.design.patterns.decorator.compromise;

import org.junit.Test;

public class CoffeeShopCompromiseTest {
    @Test
    public void testCafeMocha() {
	// This just makes sure it will complete without throwing an exception.
	// Create a decaf cafe mocha with whipped cream
	final DrinkComponent cafeMocha = new Whipped(new Decaf(new CafeMocha()));
	System.out.println(cafeMocha.getDescription() + ": $"
		+ cafeMocha.getTotalCost());
    }

    @Test
    public void testCappuccino() {
	// This just makes sure it will complete without throwing an exception.
	// Create a plain cappucino
	final DrinkComponent cappuccino = new Cappuccino();
	System.out.println(cappuccino.getDescription() + ": $"
		+ cappuccino.getTotalCost());
    }
}