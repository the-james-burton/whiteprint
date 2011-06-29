package com.design.patterns.bridge;

class Implementation1 implements Implementation {
    // Each facility delegates to a different library
    // in order to fulfill the obligations.
    private final Library1 delegate = new Library1();

    @Override
    public void facility1() {
	System.out.println("Implementation1.facility1");
	this.delegate.method1();
    }

    @Override
    public void facility2() {
	System.out.println("Implementation1.facility2");
	this.delegate.method2();
    }

    @Override
    public void facility3() {
	System.out.println("Implementation1.facility3");
	this.delegate.method2();
	this.delegate.method1();
    }

    @Override
    public void facility4() {
	System.out.println("Implementation1.facility4");
	this.delegate.method1();
    }
}