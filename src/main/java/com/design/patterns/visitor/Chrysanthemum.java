package com.design.patterns.visitor;

class Chrysanthemum implements Flower {
    public void accept(Visitor v) {
        v.visit(this);
    }
}