package com.design.patterns.facade;

public class Facade {
    A makeA(final int x) {
	return new A(x);
    }

    B makeB(final long x) {
	return new B(x);
    }

    C makeC(final double x) {
	return new C(x);
    }
}