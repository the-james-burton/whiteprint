package com.design.patterns.strategy;

class MinimaSolver {
    private FindMinima strategy;

    public MinimaSolver(FindMinima strat) {
        strategy = strat;
    }

    double[] minima(double[] line) {
        return strategy.algorithm(line);
    }

    void changeAlgorithm(FindMinima newAlgorithm) {
        strategy = newAlgorithm;
    }
}