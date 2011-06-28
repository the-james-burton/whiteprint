package com.design.patterns.bridge;

class Abstraction {
    private Implementation implementation;

    public Abstraction(Implementation imp) {
        implementation = imp;
    }

    // Abstraction used by the various front-end
    // objects in order to implement their
    // different interfaces.
    public void service1() {
        // Implement this feature using some
        // combination of back-end implementation:
        implementation.facility1();
        implementation.facility2();
    }

    public void service2() {
        // Implement this feature using some other
        // combination of back-end implementation:
        implementation.facility2();
        implementation.facility3();
    }

    public void service3() {
        // Implement this feature using some other
        // combination of back-end implementation:
        implementation.facility1();
        implementation.facility2();
        implementation.facility4();
    }

    // For use by subclasses:
    protected Implementation getImplementation() {
        return implementation;
    }
}