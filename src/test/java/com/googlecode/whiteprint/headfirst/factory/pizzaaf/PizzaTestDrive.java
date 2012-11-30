package com.googlecode.whiteprint.headfirst.factory.pizzaaf;

import org.junit.Test;

public class PizzaTestDrive {

    @Test
    public void test() {
	PizzaStore nyStore = new NYPizzaStore();
	PizzaStore chicagoStore = new ChicagoPizzaStore();

	Pizza pizza = nyStore.orderPizza("cheese");
	System.out.println("Ethan ordered a " + pizza + "\n");

	pizza = chicagoStore.orderPizza("cheese");
	System.out.println("Joel ordered a " + pizza + "\n");

	pizza = nyStore.orderPizza("clam");
	System.out.println("Ethan ordered a " + pizza + "\n");

	pizza = chicagoStore.orderPizza("clam");
	System.out.println("Joel ordered a " + pizza + "\n");

	pizza = nyStore.orderPizza("pepperoni");
	System.out.println("Ethan ordered a " + pizza + "\n");

	pizza = chicagoStore.orderPizza("pepperoni");
	System.out.println("Joel ordered a " + pizza + "\n");

	pizza = nyStore.orderPizza("veggie");
	System.out.println("Ethan ordered a " + pizza + "\n");

	pizza = chicagoStore.orderPizza("veggie");
	System.out.println("Joel ordered a " + pizza + "\n");
    }
}
