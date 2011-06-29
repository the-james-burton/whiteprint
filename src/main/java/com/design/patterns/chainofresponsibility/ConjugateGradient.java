package com.design.patterns.chainofresponsibility;

import java.util.logging.Logger;

class ConjugateGradient implements Strategy {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Override
    public LineData strategy(final LineData m) {
	log.info("Trying ConjugateGradient algorithm");
	// [ Actual test/calculation here ]
	final LineData r = new LineData(new double[] { 5.5, 6.6 }); // Dummy
								    // data
	r.setSuccessful(true);
	return r;
    }
}