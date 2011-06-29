package com.design.patterns.state;

public class Beast {
    private boolean isFrog = true;

    public void greet() {
        if (isFrog) {
            System.out.println("Ribbet!");
        } else {
            System.out.println("Darling!");
        }
    }

    public void kiss() {
        isFrog = false;
    }
}
