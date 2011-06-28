package com.design.patterns.chainofresponsibility;

class LineData {
    public double[] data;

    public LineData(double[] data) {
        this.data = data;
    }

    private boolean succeeded;

    public boolean isSuccessful() {
        return succeeded;
    }

    public void setSuccessful(boolean b) {
        succeeded = b;
    }
}