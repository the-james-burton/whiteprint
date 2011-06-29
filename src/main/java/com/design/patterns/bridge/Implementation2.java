package com.design.patterns.bridge;

class Implementation2 implements Implementation {
    private final Library2 delegate = new Library2();

    @Override
    public void facility1() {
	System.out.println("Implementation2.facility1");
	this.delegate.operation1();
    }

    @Override
    public void facility2() {
	System.out.println("Implementation2.facility2");
	this.delegate.operation2();
    }

    @Override
    public void facility3() {
	System.out.println("Implementation2.facility3");
	this.delegate.operation3();
    }

    @Override
    public void facility4() {
	System.out.println("Implementation2.facility4");
	this.delegate.operation1();
    }
}