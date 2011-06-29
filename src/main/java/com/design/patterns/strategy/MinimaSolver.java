package com.design.patterns.strategy;

class MinimaSolver {
    private FindMinima strategy;

    public MinimaSolver(final FindMinima strat) {
	this.strategy = strat;
    }

    void changeAlgorithm(final FindMinima newAlgorithm) {
	this.strategy = newAlgorithm;
    }

    double[] minima(final double[] line) {
	return this.strategy.algorithm(line);
    }
}