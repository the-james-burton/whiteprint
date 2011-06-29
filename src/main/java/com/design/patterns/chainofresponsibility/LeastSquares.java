package com.design.patterns.chainofresponsibility;

class LeastSquares implements Strategy {
    @Override
    public LineData strategy(final LineData m) {
	System.out.println("Trying LeastSquares algorithm");
	final LineData ld = m;
	// [ Actual test/calculation here ]
	final LineData r = new LineData(new double[] { 1.1, 2.2 }); // Dummy
								    // data
	r.setSuccessful(false);
	return r;
    }
}