package com.design.patterns.multipledispatch;

import java.util.Random;

class ItemGenerator {
    private static Random rand = new Random();

    public static Item newItem() {
	switch (rand.nextInt(3)) {
	default:
	case 0:
	    return new Scissors();
	case 1:
	    return new Paper();
	case 2:
	    return new Rock();
	}
    }
}