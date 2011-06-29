package com.design.patterns.decorator.nodecorators;

import java.util.logging.Logger;

import org.junit.Test;

public class CoffeeShopNoDecoratorsTest {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Test
    public void testCafeMocha() {
	// This just makes sure it will complete without throwing an exception.
	// Create a decaf cafe mocha with whipped cream
	final CafeMochaDecafWhipped cafeMocha = new CafeMochaDecafWhipped();
	log.info(cafeMocha.getDescription() + ": $" + cafeMocha.getCost());
    }

    @Test
    public void testCappuccino() {
	// This just makes sure it will complete without throwing an exception.
	// Create a plain cappuccino
	final Cappuccino cappuccino = new Cappuccino();
	log.info(cappuccino.getDescription() + ": $" + cappuccino.getCost());
    }
}
