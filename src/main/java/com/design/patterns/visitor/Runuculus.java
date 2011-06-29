package com.design.patterns.visitor;

class Runuculus implements Flower {
    @Override
    public void accept(final Visitor v) {
	v.visit(this);
    }
}