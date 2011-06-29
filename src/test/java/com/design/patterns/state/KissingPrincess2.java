package com.design.patterns.state;

import org.junit.Test;

public class KissingPrincess2 {
    Creature creature = new Creature();

    @Test
    public void test() {
        creature.greet();
        creature.kiss();
        creature.greet();
    }
}
