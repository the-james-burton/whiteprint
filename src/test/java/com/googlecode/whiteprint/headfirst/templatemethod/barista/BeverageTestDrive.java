package com.googlecode.whiteprint.headfirst.templatemethod.barista;

import org.apache.commons.io.IOUtils;
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
	System.setIn(IOUtils.toInputStream("y\n"));
	CoffeeWithHook coffeeHook = new CoffeeWithHook();
	System.setIn(IOUtils.toInputStream("y\n"));
	System.setIn(System.in);

	System.out.println("\nMaking tea...");
	teaHook.prepareRecipe();

	System.out.println("\nMaking coffee...");
	coffeeHook.prepareRecipe();
    }
}
