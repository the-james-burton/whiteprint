package com.design.patterns.chainofresponsibility;

import java.util.List;

class LineData {
    public List<Double> data;

    private boolean succeeded;

    public LineData(final List<Double> data) {
	this.data = data;
    }

    public boolean isSuccessful() {
	return this.succeeded;
    }

    public void setSuccessful(final boolean b) {
	this.succeeded = b;
    }
}