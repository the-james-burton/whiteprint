package com.design.patterns.chainofresponsibility;

class MinimaFinder {
    private static Strategy[] solutions = { new LeastSquares(),
	    new NewtonsMethod(), new Bisection(), new ConjugateGradient(), };

    public static LineData solve(final LineData line) {
	LineData r = line;
	for (final Strategy solution : solutions) {
	    r = solution.strategy(r);
	    if (r.isSuccessful()) {
		return r;
	    }
	}
	throw new RuntimeException("unsolved: " + line);
    }
}