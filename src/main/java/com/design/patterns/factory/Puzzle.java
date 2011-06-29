package com.design.patterns.factory;

class Puzzle implements Obstacle {
    @Override
    public void action() {
	System.out.println("Puzzle");
    }
}