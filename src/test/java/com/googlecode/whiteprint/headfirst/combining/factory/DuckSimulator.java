package com.googlecode.whiteprint.headfirst.combining.factory;

import org.junit.Test;

public class DuckSimulator {

    @Test
    public void test() {
	DuckSimulator simulator = new DuckSimulator();
	AbstractDuckFactory duckFactory = new CountingDuckFactory();

	simulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
	Quackable mallardDuck = duckFactory.createMallardDuck();
	Quackable redheadDuck = duckFactory.createRedheadDuck();
	Quackable duckCall = duckFactory.createDuckCall();
	Quackable rubberDuck = duckFactory.createRubberDuck();
	Quackable gooseDuck = new GooseAdapter(new Goose());

	System.out.println("\nDuck Simulator: With Abstract Factory");

	simulate(mallardDuck);
	simulate(redheadDuck);
	simulate(duckCall);
	simulate(rubberDuck);
	simulate(gooseDuck);

	System.out.println("The ducks quacked " + QuackCounter.getQuacks()
		+ " times");
    }

    private void simulate(Quackable duck) {
	duck.quack();
    }
}
