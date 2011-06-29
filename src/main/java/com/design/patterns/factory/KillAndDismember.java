package com.design.patterns.factory;

class KillAndDismember implements GameElementFactory {
    @Override
    public Obstacle makeObstacle() {
	return new NastyWeapon();
    }

    @Override
    public Player makePlayer() {
	return new KungFuGuy();
    }
}