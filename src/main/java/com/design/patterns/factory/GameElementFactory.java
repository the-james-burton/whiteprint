package com.design.patterns.factory;

interface GameElementFactory {
    Obstacle makeObstacle();

    Player makePlayer();
}