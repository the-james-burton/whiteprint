package com.design.patterns.multipledispatch;

import org.junit.Test;

public class PaperScissorsRock {
    int SIZE = 20;

    @Test
    public void test() {
        for (int i = 0; i < SIZE; i++) {
            Compete.match(ItemGenerator.newItem(), ItemGenerator.newItem());
        }
    }
}
