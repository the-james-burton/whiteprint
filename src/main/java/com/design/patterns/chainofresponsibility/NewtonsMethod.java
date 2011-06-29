package com.design.patterns.chainofresponsibility;

class NewtonsMethod implements Strategy {
    @Override
    public LineData strategy(final LineData m) {
	System.out.println("Trying NewtonsMethod algorithm");
	final LineData ld = m;
	// [ Actual test/calculation here ]
	final LineData r = new LineData(new double[] { 3.3, 4.4 }); // Dummy
								    // data
	r.setSuccessful(false);
	return r;
    }
}