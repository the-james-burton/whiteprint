package com.googlecode.whiteprint.tip.factory;

interface GameElementFactory {
    Obstacle makeObstacle();

    Player makePlayer();
}