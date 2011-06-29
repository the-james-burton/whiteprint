package com.design.patterns.adapter.simple;

class Adapter extends Target {
    private final Adaptee adaptee;

    public Adapter(final Adaptee a) {
	this.adaptee = a;
    }

    @Override
    public void request() {
	this.adaptee.specificRequest();
    }
}