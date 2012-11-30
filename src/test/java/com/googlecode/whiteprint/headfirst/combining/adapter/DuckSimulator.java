package com.googlecode.whiteprint.headfirst.combining.adapter;

import org.junit.Test;

public class DuckSimulator {

    @Test
    public void test() {
	DuckSimulator simulator = new DuckSimulator();
	simulator.simulate();
    }

    private void simulate() {
	Quackable mallardDuck = new MallardDuck();
	Quackable redheadDuck = new RedheadDuck();
	Quackable duckCall = new DuckCall();
	Quackable rubberDuck = new RubberDuck();
	Quackable gooseDuck = new GooseAdapter(new Goose());

	System.out.println("\nDuck Simulator: With Goose Adapter");

	simulate(mallardDuck);
	simulate(redheadDuck);
	simulate(duckCall);
	simulate(rubberDuck);
	simulate(gooseDuck);
    }

    private void simulate(Quackable duck) {
	duck.quack();
    }
}
