package com.design.patterns.factory;

class KittiesAndPuzzles implements GameElementFactory {
    public Player makePlayer() {
        return new Kitty();
    }

    public Obstacle makeObstacle() {
        return new Puzzle();
    }
}