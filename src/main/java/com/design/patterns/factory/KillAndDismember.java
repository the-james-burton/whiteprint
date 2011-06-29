package com.design.patterns.factory;

class KillAndDismember implements GameElementFactory {
    public Player makePlayer() {
        return new KungFuGuy();
    }

    public Obstacle makeObstacle() {
        return new NastyWeapon();
    }
}