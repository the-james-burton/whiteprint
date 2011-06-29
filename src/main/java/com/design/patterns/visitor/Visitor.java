package com.design.patterns.visitor;

interface Visitor {
    void visit(Gladiolus g);

    void visit(Runuculus r);

    void visit(Chrysanthemum c);
}