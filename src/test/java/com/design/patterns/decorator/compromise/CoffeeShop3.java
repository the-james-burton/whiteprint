package com.design.patterns.decorator.compromise;

import org.junit.Test;

public class CoffeeShop3 {
    @Test
    public void testCappuccino() {
        // This just makes sure it will complete without throwing an exception. Create a plain cappucino
        DrinkComponent cappuccino = new Cappuccino();
        System.out.println(cappuccino.getDescription() + ": $" + cappuccino.getTotalCost());
    }

    @Test
    public void testCafeMocha() {
        // This just makes sure it will complete without throwing an exception. Create a decaf cafe mocha with whipped cream
        DrinkComponent cafeMocha = new Whipped(new Decaf(new CafeMocha()));
        System.out.println(cafeMocha.getDescription() + ": $" + cafeMocha.getTotalCost());
    }
}