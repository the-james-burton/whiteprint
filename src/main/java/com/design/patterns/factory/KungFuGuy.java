package com.design.patterns.factory;

class KungFuGuy implements Player {
    @Override
    public void interactWith(final Obstacle ob) {
	System.out.print("KungFuGuy now battles a ");
	ob.action();
    }
}