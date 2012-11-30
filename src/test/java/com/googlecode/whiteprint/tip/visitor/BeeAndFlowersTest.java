package com.googlecode.whiteprint.tip.visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.junit.Test;

public class BeeAndFlowersTest {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    List<Flower> flowers = new ArrayList<Flower>();

    public BeeAndFlowersTest() {
	for (int i = 0; i < 10; i++) {
	    this.flowers.add(FlowerGenerator.newFlower());
	}
    }

    @Test
    public void test() {
	// It's almost as if I had a function to produce a Flower string
	// representation:
	final StringVal sval = new StringVal();
	for (Flower flower : flowers) {
	    flower.accept(sval);
	    log.info(sval.toString());
	}
	// Perform "Bee" operation on all Flowers:
	final Bee bee = new Bee();
	for (Flower flower : flowers) {
	    flower.accept(bee);
	}
    }
}
