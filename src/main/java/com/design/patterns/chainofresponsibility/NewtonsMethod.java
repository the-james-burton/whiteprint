package com.design.patterns.chainofresponsibility;

import java.util.logging.Logger;

class NewtonsMethod implements Strategy {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Override
    public LineData strategy(final LineData m) {
	log.info("Trying NewtonsMethod algorithm");
	// [ Actual test/calculation here ]
	final LineData r = new LineData(new double[] { 3.3, 4.4 }); // Dummy
								    // data
	r.setSuccessful(false);
	return r;
    }
}