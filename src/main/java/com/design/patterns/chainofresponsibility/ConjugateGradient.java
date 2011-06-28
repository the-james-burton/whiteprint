package com.design.patterns.chainofresponsibility;

class ConjugateGradient implements Strategy {
    public LineData strategy(LineData m) {
        System.out.println("Trying ConjugateGradient algorithm");
        LineData ld = (LineData) m;
        // [ Actual test/calculation here ]
        LineData r = new LineData(new double[] { 5.5, 6.6 }); // Dummy data
        r.setSuccessful(true);
        return r;
    }
}