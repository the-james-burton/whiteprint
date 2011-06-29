package com.design.patterns.multipledispatch;

class Outcome {
    private String name;

    private Outcome(String name) {
        this.name = name;
    }

    public final static Outcome WIN = new Outcome("wins"), LOSE = new Outcome("loses"), DRAW = new Outcome("draws");

    public String toString() {
        return name;
    }
}