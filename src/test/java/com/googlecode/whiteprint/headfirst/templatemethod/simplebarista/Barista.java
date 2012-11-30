package com.googlecode.whiteprint.headfirst.templatemethod.simplebarista;

import org.junit.Test;

public class Barista {

    @Test
    public void test() {
	Tea tea = new Tea();
	Coffee coffee = new Coffee();
	System.out.println("Making tea...");
	tea.prepareRecipe();
	System.out.println("Making coffee...");
	coffee.prepareRecipe();
    }
}
