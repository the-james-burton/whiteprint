package com.googlecode.whiteprint.tip.visitor;

interface Visitor {
    void visit(Chrysanthemum c);

    void visit(Gladiolus g);

    void visit(Runuculus r);
}