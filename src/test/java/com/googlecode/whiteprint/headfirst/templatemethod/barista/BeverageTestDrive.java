package com.googlecode.whiteprint.headfirst.templatemethod.barista;

import org.junit.Test;

public class BeverageTestDrive {

    @Test
    public void test() {

	Tea tea = new Tea();
	Coffee coffee = new Coffee();

	System.out.println("\nMaking tea...");
	tea.prepareRecipe();

	System.out.println("\nMaking coffee...");
	coffee.prepareRecipe();

	TeaWithHook teaHook = new TeaWithHook();
	CoffeeWithHook coffeeHook = new CoffeeWithHook();

	System.out.println("\nMaking tea...");
	teaHook.prepareRecipe();

	System.out.println("\nMaking coffee...");
	coffeeHook.prepareRecipe();
    }
}
