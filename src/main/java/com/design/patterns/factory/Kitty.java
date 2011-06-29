package com.design.patterns.factory;

class Kitty implements Player {
    @Override
    public void interactWith(final Obstacle ob) {
	System.out.print("Kitty has encountered a ");
	ob.action();
    }
}