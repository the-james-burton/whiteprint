package com.googlecode.whiteprint.tip.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

class NewtonsMethod implements Strategy {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Override
    public LineData strategy(final LineData m) {
	log.info("Trying NewtonsMethod algorithm");
	// [ Actual test/calculation here ]
	List<Double> data = new ArrayList<Double>();
	data.add(3.3);
	data.add(4.4);
	final LineData r = new LineData(data); // Dummy data
	r.setSuccessful(false);
	return r;
    }
}