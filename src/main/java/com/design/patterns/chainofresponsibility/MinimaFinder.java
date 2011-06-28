package com.design.patterns.chainofresponsibility;

class MinimaFinder {
    private static Strategy[] solutions = { new LeastSquares(), new NewtonsMethod(), new Bisection(), new ConjugateGradient(), };

    public static LineData solve(LineData line) {
        LineData r = line;
        for (int i = 0; i < solutions.length; i++) {
            r = solutions[i].strategy(r);
            if (r.isSuccessful())
                return r;
        }
        throw new RuntimeException("unsolved: " + line);
    }
}