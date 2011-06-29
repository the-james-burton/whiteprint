package com.design.patterns.flyweight;

import org.junit.Test;

public class ManyObjects {
    final int size = 1000000;

    @Test
    public void test() {
        DataPoint[] array = new DataPoint[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = new DataPoint();
        }
        for (DataPoint dp : array) {
            dp.setI(dp.getI() + 1);
            dp.setF(47.0f);
        }
        System.out.println(array[size - 1]);
    }
}