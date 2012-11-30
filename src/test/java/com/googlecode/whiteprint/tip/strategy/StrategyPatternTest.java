package com.googlecode.whiteprint.tip.strategy;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.junit.Test;

public class StrategyPatternTest {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    MinimaSolver solver = new MinimaSolver(new LeastSquares());
    List<Double> line = Arrays.asList(new Double[]{ 1.0, 2.0, 1.0, 2.0, -1.0, 3.0, 4.0, 5.0, 4.0 });

    @Test
    public void test() {
	log.info(this.solver.minima(this.line).toString());
	this.solver.changeAlgorithm(new Bisection());
	log.info(this.solver.minima(this.line).toString());
    }
}
