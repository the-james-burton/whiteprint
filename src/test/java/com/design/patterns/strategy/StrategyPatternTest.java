package com.design.patterns.strategy;

import java.util.Arrays;
import java.util.logging.Logger;

import org.junit.Test;

public class StrategyPatternTest {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    MinimaSolver solver = new MinimaSolver(new LeastSquares());
    double[] line = { 1.0, 2.0, 1.0, 2.0, -1.0, 3.0, 4.0, 5.0, 4.0 };

    @Test
    public void test() {
	log.info(Arrays.toString(this.solver.minima(this.line)));
	this.solver.changeAlgorithm(new Bisection());
	log.info(Arrays.toString(this.solver.minima(this.line)));
    }
}
