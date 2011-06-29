package com.design.patterns.state;

public class Beast {
    private boolean isFrog = true;

    public void greet() {
	if (this.isFrog) {
	    System.out.println("Ribbet!");
	} else {
	    System.out.println("Darling!");
	}
    }

    public void kiss() {
	this.isFrog = false;
    }
}
