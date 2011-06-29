package com.design.patterns.factory;

class KittiesAndPuzzles implements GameElementFactory {
    @Override
    public Obstacle makeObstacle() {
	return new Puzzle();
    }

    @Override
    public Player makePlayer() {
	return new Kitty();
    }
}