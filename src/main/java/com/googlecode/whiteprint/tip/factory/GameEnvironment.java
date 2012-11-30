package com.googlecode.whiteprint.tip.factory;

class GameEnvironment {
    private final Player p;
    private final Obstacle ob;

    public GameEnvironment(final GameElementFactory factory) {
	this.p = factory.makePlayer();
	this.ob = factory.makeObstacle();
    }

    public void play() {
	this.p.interactWith(this.ob);
    }
}