package com.googlecode.whiteprint.tip.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

class LeastSquares implements Strategy {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Override
    public LineData strategy(final LineData m) {
	log.info("Trying LeastSquares algorithm");
	// [ Actual test/calculation here ]
	List<Double> data = new ArrayList<Double>();
	data.add(1.1);
	data.add(2.2);
	final LineData r = new LineData(data); // Dummy data
	r.setSuccessful(false);
	return r;
    }
}