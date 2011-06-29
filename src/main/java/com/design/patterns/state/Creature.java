package com.design.patterns.state;

class Creature {
    private State state = new Frog();

    public void greet() {
	System.out.println(this.state.response());
    }

    public void kiss() {
	this.state = new Prince();
    }
}