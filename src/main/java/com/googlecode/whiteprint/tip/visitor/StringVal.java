package com.googlecode.whiteprint.tip.visitor;

class StringVal implements Visitor {
    String s;

    @Override
    public String toString() {
	return this.s;
    }

    @Override
    public void visit(final Chrysanthemum c) {
	this.s = "Chrysanthemum";
    }

    @Override
    public void visit(final Gladiolus g) {
	this.s = "Gladiolus";
    }

    @Override
    public void visit(final Runuculus r) {
	this.s = "Runuculus";
    }
}