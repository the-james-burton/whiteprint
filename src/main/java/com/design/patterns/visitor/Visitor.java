package com.design.patterns.visitor;

interface Visitor {
    void visit(Chrysanthemum c);

    void visit(Gladiolus g);

    void visit(Runuculus r);
}