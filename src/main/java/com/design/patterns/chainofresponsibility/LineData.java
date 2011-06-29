package com.design.patterns.chainofresponsibility;

class LineData {
    public double[] data;

    private boolean succeeded;

    public LineData(final double[] data) {
	this.data = data;
    }

    public boolean isSuccessful() {
	return this.succeeded;
    }

    public void setSuccessful(final boolean b) {
	this.succeeded = b;
    }
}