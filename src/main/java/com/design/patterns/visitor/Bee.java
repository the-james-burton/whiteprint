package com.design.patterns.visitor;

class Bee implements Visitor {
    @Override
    public void visit(final Chrysanthemum c) {
	System.out.println("Bee and Chrysanthemum");
    }

    @Override
    public void visit(final Gladiolus g) {
	System.out.println("Bee and Gladiolus");
    }

    @Override
    public void visit(final Runuculus r) {
	System.out.println("Bee and Runuculus");
    }
}