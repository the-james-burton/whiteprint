package com.design.patterns.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class BeeAndFlowersTest {
    List flowers = new ArrayList();

    public BeeAndFlowersTest() {
        for (int i = 0; i < 10; i++) {
            flowers.add(FlowerGenerator.newFlower());
        }
    }

    @Test
    public void test() {
        // It's almost as if I had a function to produce a Flower string representation:
        StringVal sval = new StringVal();
        Iterator it = flowers.iterator();
        while (it.hasNext()) {
            ((Flower) it.next()).accept(sval);
            System.out.println(sval);
        }
        // Perform "Bee" operation on all Flowers:
        Bee bee = new Bee();
        it = flowers.iterator();
        while (it.hasNext()) {
            ((Flower) it.next()).accept(bee);
        }
    }
}
