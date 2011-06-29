package com.design.patterns.strategy;

import java.util.Arrays;

import org.junit.Test;

public class StrategyPatternTest {
    MinimaSolver solver = new MinimaSolver(new LeastSquares());
    double[]     line   = { 1.0, 2.0, 1.0, 2.0, -1.0, 3.0, 4.0, 5.0, 4.0 };

    @Test
    public void test() {
        System.out.println(Arrays.toString(solver.minima(line)));
        solver.changeAlgorithm(new Bisection());
        System.out.println(Arrays.toString(solver.minima(line)));
    }
}
