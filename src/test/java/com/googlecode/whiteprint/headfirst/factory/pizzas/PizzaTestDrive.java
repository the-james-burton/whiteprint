package com.googlecode.whiteprint.headfirst.factory.pizzas;

import org.junit.Test;

public class PizzaTestDrive {

    @Test
    public void test() {
	SimplePizzaFactory factory = new SimplePizzaFactory();
	PizzaStore store = new PizzaStore(factory);

	Pizza pizza = store.orderPizza("cheese");
	System.out.println("We ordered a " + pizza.getName() + "\n");

	pizza = store.orderPizza("veggie");
	System.out.println("We ordered a " + pizza.getName() + "\n");
    }
}
