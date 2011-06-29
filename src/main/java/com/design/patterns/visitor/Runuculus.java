package com.design.patterns.visitor;

class Runuculus implements Flower {
    public void accept(Visitor v) {
        v.visit(this);
    }
}