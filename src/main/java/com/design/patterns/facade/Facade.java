package com.design.patterns.facade;

public class Facade {
    A makeA(int x) {
        return new A(x);
    }

    B makeB(long x) {
        return new B(x);
    }

    C makeC(double x) {
        return new C(x);
    }
}