package com.design.patterns.flyweight;

import org.junit.Test;

public class ManyObjectsTest {
    final int size = 1000000;

    @Test
    public void test() {
	final DataPoint[] array = new DataPoint[this.size];
	for (int i = 0; i < array.length; i++) {
	    array[i] = new DataPoint();
	}
	for (final DataPoint dp : array) {
	    dp.setI(dp.getI() + 1);
	    dp.setF(47.0f);
	}
	System.out.println(array[this.size - 1]);
    }
}