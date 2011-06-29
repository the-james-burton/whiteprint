package com.design.patterns.state;

import org.junit.Test;

public class KissingPrincess2Test {
    Creature creature = new Creature();

    @Test
    public void test() {
	this.creature.greet();
	this.creature.kiss();
	this.creature.greet();
    }
}
