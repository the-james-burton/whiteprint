package com.design.patterns.visitor;

class Bee implements Visitor {
    public void visit(Gladiolus g) {
        System.out.println("Bee and Gladiolus");
    }

    public void visit(Runuculus r) {
        System.out.println("Bee and Runuculus");
    }

    public void visit(Chrysanthemum c) {
        System.out.println("Bee and Chrysanthemum");
    }
}