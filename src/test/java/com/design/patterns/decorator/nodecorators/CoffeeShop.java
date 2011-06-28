package com.design.patterns.decorator.nodecorators;

import org.junit.Test;

public class CoffeeShop {
    @Test
    public void testCappuccino() {
        // This just makes sure it will complete without throwing an exception. Create a plain cappuccino
        Cappuccino cappuccino = new Cappuccino();
        System.out.println(cappuccino.getDescription() + ": $" + cappuccino.getCost());
    }

    @Test
    public void testCafeMocha() {
        // This just makes sure it will complete without throwing an exception. Create a decaf cafe mocha with whipped cream
        CafeMochaDecafWhipped cafeMocha = new CafeMochaDecafWhipped();
        System.out.println(cafeMocha.getDescription() + ": $" + cafeMocha.getCost());
    }
}
