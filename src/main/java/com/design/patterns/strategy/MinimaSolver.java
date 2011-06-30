package com.design.patterns.strategy;

import java.util.List;

class MinimaSolver {
    private FindMinima strategy;

    public MinimaSolver(final FindMinima strat) {
	this.strategy = strat;
    }

    void changeAlgorithm(final FindMinima newAlgorithm) {
	this.strategy = newAlgorithm;
    }

    List<Double> minima(final List<Double> line) {
	return this.strategy.algorithm(line);
    }
}