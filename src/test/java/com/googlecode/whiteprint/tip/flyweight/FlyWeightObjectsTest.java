package com.googlecode.whiteprint.tip.flyweight;

import java.util.logging.Logger;

import org.junit.Test;

public class FlyWeightObjectsTest {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Test
    public void test() {
	for (int i = 0; i < ExternalizedData.size; i++) {
	    FlyPoint.setI(i, FlyPoint.getI(i) + 1);
	    FlyPoint.setF(i, 47.0f);
	}
	log.info(FlyPoint.str(ExternalizedData.size - 1));
    }
}
