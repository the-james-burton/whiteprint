package com.design.patterns.flyweight;

import org.junit.Test;

public class FlyWeightObjectsTest {
    @Test
    public void test() {
	for (int i = 0; i < ExternalizedData.size; i++) {
	    FlyPoint.setI(i, FlyPoint.getI(i) + 1);
	    FlyPoint.setF(i, 47.0f);
	}
	System.out.println(FlyPoint.str(ExternalizedData.size - 1));
    }
}
