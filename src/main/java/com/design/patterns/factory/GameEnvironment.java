package com.design.patterns.factory;

class GameEnvironment {
    private final GameElementFactory gef;
    private final Player p;
    private final Obstacle ob;

    public GameEnvironment(final GameElementFactory factory) {
	this.gef = factory;
	this.p = factory.makePlayer();
	this.ob = factory.makeObstacle();
    }

    public void play() {
	this.p.interactWith(this.ob);
    }
}