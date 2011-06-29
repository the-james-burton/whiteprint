package com.design.patterns.factory;

class Kitty implements Player {
    public void interactWith(Obstacle ob) {
        System.out.print("Kitty has encountered a ");
        ob.action();
    }
}