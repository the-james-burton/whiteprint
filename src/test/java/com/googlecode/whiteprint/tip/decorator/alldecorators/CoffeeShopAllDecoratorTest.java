package com.googlecode.whiteprint.tip.decorator.alldecorators;

import java.util.logging.Logger;

import org.junit.Test;

public class CoffeeShopAllDecoratorTest {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Test
    public void testCafeMocha() {
	// This just makes sure it will complete without throwing an exception.
	// Create a decaf cafe mocha with whipped cream
	final DrinkComponent cafeMocha = new Espresso(new SteamedMilk(
		new Chocolate(new Whipped(new Decaf(new Mug())))));
	log.info(cafeMocha.getDescription().trim() + ": $"
		+ cafeMocha.getTotalCost());
    }

    @Test
    public void testCappuccino() {
	// This just makes sure it will complete without throwing an exception.
	// Create a plain cappucino
	final DrinkComponent cappuccino = new Espresso(
		new FoamedMilk(new Mug()));
	log.info(cappuccino.getDescription().trim() + ": $"
		+ cappuccino.getTotalCost());
    }
}