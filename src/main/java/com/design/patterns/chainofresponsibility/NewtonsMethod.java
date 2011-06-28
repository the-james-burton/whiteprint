package com.design.patterns.chainofresponsibility;

class NewtonsMethod implements Strategy {
    public LineData strategy(LineData m) {
        System.out.println("Trying NewtonsMethod algorithm");
        LineData ld = (LineData) m;
        // [ Actual test/calculation here ]
        LineData r = new LineData(new double[] { 3.3, 4.4 }); // Dummy data
        r.setSuccessful(false);
        return r;
    }
}