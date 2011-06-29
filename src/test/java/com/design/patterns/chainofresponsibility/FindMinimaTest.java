package com.design.patterns.chainofresponsibility;

import java.util.Arrays;

import org.junit.Test;

public class FindMinimaTest {
    LineData line = new LineData(new double[] { 1.0, 2.0, 1.0, 2.0, -1.0, 3.0,
	    4.0, 5.0, 4.0 });

    @Test
    public void test() {
	System.out
		.println(Arrays.toString((MinimaFinder.solve(this.line)).data));
    }
}
