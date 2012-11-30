package com.googlecode.whiteprint.tip.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

class Bisection implements Strategy {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Override
    public LineData strategy(final LineData m) {
	log.info("Trying Bisection algorithm");
	// [ Actual test/calculation here ]
	List<Double> data = new ArrayList<Double>();
	data.add(5.5);
	data.add(6.6);
	final LineData r = new LineData(data); // Dummy data
	r.setSuccessful(true);
	return r;
    }
}