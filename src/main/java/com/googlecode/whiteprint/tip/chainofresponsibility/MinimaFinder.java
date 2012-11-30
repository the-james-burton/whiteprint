package com.googlecode.whiteprint.tip.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

class MinimaFinder {
    private static List<Strategy> solutions = new ArrayList<Strategy>(); 
    
    static {
	solutions.add(new LeastSquares());
	solutions.add(new NewtonsMethod());
	solutions.add(new Bisection());
	solutions.add(new ConjugateGradient());
    }
    
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