package com.googlecode.whiteprint.tip.chainofresponsibility;

import java.util.Arrays;

import org.junit.Test;

public class FindMinimaTest {

    @Test
    public void test() {
	LineData line = new LineData(Arrays.asList(new Double[] { 1.0, 2.0,
		1.0, 2.0, -1.0, 3.0, 4.0, 5.0, 4.0 }));
	System.out.println((MinimaFinder.solve(line)).data);
    }
}
