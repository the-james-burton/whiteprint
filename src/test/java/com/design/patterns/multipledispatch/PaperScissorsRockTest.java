package com.design.patterns.multipledispatch;

import org.junit.Test;

public class PaperScissorsRockTest {
    int SIZE = 20;

    @Test
    public void test() {
	for (int i = 0; i < this.SIZE; i++) {
	    Compete.match(ItemGenerator.newItem(), ItemGenerator.newItem());
	}
    }
}
