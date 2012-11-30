package com.googlecode.whiteprint.tip.visitor;

class Gladiolus implements Flower {
    @Override
    public void accept(final Visitor v) {
	v.visit(this);
    }
}