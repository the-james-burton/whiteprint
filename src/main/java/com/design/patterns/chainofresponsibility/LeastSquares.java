package com.design.patterns.chainofresponsibility;

class LeastSquares implements Strategy {
    public LineData strategy(LineData m) {
        System.out.println("Trying LeastSquares algorithm");
        LineData ld = (LineData) m;
        // [ Actual test/calculation here ]
        LineData r = new LineData(new double[] { 1.1, 2.2 }); // Dummy data
        r.setSuccessful(false);
        return r;
    }
}