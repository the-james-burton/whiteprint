package com.design.patterns.chainofresponsibility;

class Bisection implements Strategy {
    @Override
    public LineData strategy(final LineData m) {
	System.out.println("Trying Bisection algorithm");
	final LineData ld = m;
	// [ Actual test/calculation here ]
	final LineData r = new LineData(new double[] { 5.5, 6.6 }); // Dummy
								    // data
	r.setSuccessful(true);
	return r;
    }
}