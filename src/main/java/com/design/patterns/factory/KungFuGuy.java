package com.design.patterns.factory;

class KungFuGuy implements Player {
    public void interactWith(Obstacle ob) {
        System.out.print("KungFuGuy now battles a ");
        ob.action();
    }
}