package com.googlecode.whiteprint.tip.multipledispatch;

import org.junit.Test;

public class PaperScissorsRockTest {

    int SIZE = 20;

    @Test
    public void test() {
	Compete compete = new Compete();
	for (int i = 0; i < this.SIZE; i++) {
	    compete.match(ItemGenerator.newItem(), ItemGenerator.newItem());
	}
    }
}
