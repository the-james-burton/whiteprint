package com.googlecode.whiteprint.tip.flyweight;

import java.util.logging.Logger;

import org.junit.Test;

public class ManyObjectsTest {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

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
	log.info(array[this.size - 1].toString());
    }
}