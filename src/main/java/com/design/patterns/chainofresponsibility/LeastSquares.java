package com.design.patterns.chainofresponsibility;

import java.util.logging.Logger;

class LeastSquares implements Strategy {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Override
    public LineData strategy(final LineData m) {
	log.info("Trying LeastSquares algorithm");
	// [ Actual test/calculation here ]
	final LineData r = new LineData(new double[] { 1.1, 2.2 }); // Dummy
								    // data
	r.setSuccessful(false);
	return r;
    }
}