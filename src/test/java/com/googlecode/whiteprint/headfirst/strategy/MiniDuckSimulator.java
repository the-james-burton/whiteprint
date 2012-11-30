package com.googlecode.whiteprint.headfirst.strategy;

import org.junit.Test;

public class MiniDuckSimulator {

    @Test
    public void test() {

	MallardDuck mallard = new MallardDuck();
	RubberDuck rubberDuckie = new RubberDuck();
	DecoyDuck decoy = new DecoyDuck();

	ModelDuck model = new ModelDuck();

	mallard.performQuack();
	rubberDuckie.performQuack();
	decoy.performQuack();

	model.performFly();
	model.setFlyBehavior(new FlyRocketPowered());
	model.performFly();
    }
}
