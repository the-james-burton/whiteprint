package com.googlecode.whiteprint.headfirst.combining.ducks;

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

	System.out.println("\nDuck Simulator");

	simulate(mallardDuck);
	simulate(redheadDuck);
	simulate(duckCall);
	simulate(rubberDuck);
    }

    private void simulate(Quackable duck) {
	duck.quack();
    }
}
