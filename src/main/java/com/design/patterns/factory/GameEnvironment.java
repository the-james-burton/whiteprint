package com.design.patterns.factory;

class GameEnvironment {
    private GameElementFactory gef;
    private Player             p;
    private Obstacle           ob;

    public GameEnvironment(GameElementFactory factory) {
        gef = factory;
        p = factory.makePlayer();
        ob = factory.makeObstacle();
    }

    public void play() {
        p.interactWith(ob);
    }
}