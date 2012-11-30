package com.googlecode.whiteprint.tip.decorator.compromise;

import java.util.logging.Logger;

import org.junit.Test;

public class CoffeeShopCompromiseTest {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Test
    public void testCafeMocha() {
	// This just makes sure it will complete without throwing an exception.
	// Create a decaf cafe mocha with whipped cream
	final DrinkComponent cafeMocha = new Whipped(new Decaf(new CafeMocha()));
	log.info(cafeMocha.getDescription() + ": $" + cafeMocha.getTotalCost());
    }

    @Test
    public void testCappuccino() {
	// This just makes sure it will complete without throwing an exception.
	// Create a plain cappucino
	final DrinkComponent cappuccino = new Cappuccino();
	log.info(cappuccino.getDescription() + ": $"
		+ cappuccino.getTotalCost());
    }
}