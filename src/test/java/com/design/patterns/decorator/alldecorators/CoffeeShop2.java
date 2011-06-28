package com.design.patterns.decorator.alldecorators;

import org.junit.Test;

public class CoffeeShop2 {
    @Test
    public void testCappuccino() {
        // This just makes sure it will complete without throwing an exception. Create a plain cappucino
        DrinkComponent cappuccino = new Espresso(new FoamedMilk(new Mug()));
        System.out.println(cappuccino.getDescription().trim() + ": $" + cappuccino.getTotalCost());
    }

    @Test
    public void testCafeMocha() {
        // This just makes sure it will complete without throwing an exception. Create a decaf cafe mocha with whipped cream
        DrinkComponent cafeMocha = new Espresso(new SteamedMilk(new Chocolate(new Whipped(new Decaf(new Mug())))));
        System.out.println(cafeMocha.getDescription().trim() + ": $" + cafeMocha.getTotalCost());
    }
}