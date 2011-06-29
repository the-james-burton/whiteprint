package com.design.patterns.state;

class Creature {
    private State state = new Frog();

    public void greet() {
        System.out.println(state.response());
    }

    public void kiss() {
        state = new Prince();
    }
}