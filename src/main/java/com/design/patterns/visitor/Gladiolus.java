package com.design.patterns.visitor;

class Gladiolus implements Flower {
    @Override
    public void accept(final Visitor v) {
	v.visit(this);
    }
}