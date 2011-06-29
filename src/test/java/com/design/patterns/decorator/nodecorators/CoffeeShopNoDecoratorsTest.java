package com.design.patterns.decorator.nodecorators;

import org.junit.Test;

public class CoffeeShopNoDecoratorsTest {
    @Test
    public void testCafeMocha() {
	// This just makes sure it will complete without throwing an exception.
	// Create a decaf cafe mocha with whipped cream
	final CafeMochaDecafWhipped cafeMocha = new CafeMochaDecafWhipped();
	System.out.println(cafeMocha.getDescription() + ": $"
		+ cafeMocha.getCost());
    }

    @Test
    public void testCappuccino() {
	// This just makes sure it will complete without throwing an exception.
	// Create a plain cappuccino
	final Cappuccino cappuccino = new Cappuccino();
	System.out.println(cappuccino.getDescription() + ": $"
		+ cappuccino.getCost());
    }
}
