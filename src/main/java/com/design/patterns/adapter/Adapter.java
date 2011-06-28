package com.design.patterns.adapter;

public class Adapter extends Target {
    private final Adaptee adaptee;

    public Adapter(Adaptee a) {
        adaptee = a;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}