package com.googlecode.whiteprint.headfirst.strategy;

import org.junit.Test;

public class MiniDuckSimulator1 {

    @Test
    public void test() {

	Duck mallard = new MallardDuck();
	mallard.performQuack();
	mallard.performFly();

	Duck model = new ModelDuck();
	model.performFly();
	model.setFlyBehavior(new FlyRocketPowered());
	model.performFly();

    }
}
