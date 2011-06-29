package com.design.patterns.bridge;

class Abstraction {
    private final Implementation implementation;

    public Abstraction(final Implementation imp) {
	this.implementation = imp;
    }

    // For use by subclasses:
    protected Implementation getImplementation() {
	return this.implementation;
    }

    // Abstraction used by the various front-end
    // objects in order to implement their
    // different interfaces.
    public void service1() {
	// Implement this feature using some
	// combination of back-end implementation:
	this.implementation.facility1();
	this.implementation.facility2();
    }

    public void service2() {
	// Implement this feature using some other
	// combination of back-end implementation:
	this.implementation.facility2();
	this.implementation.facility3();
    }

    public void service3() {
	// Implement this feature using some other
	// combination of back-end implementation:
	this.implementation.facility1();
	this.implementation.facility2();
	this.implementation.facility4();
    }
}