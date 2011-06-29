package com.design.patterns.factory;

interface GameElementFactory {
    Player makePlayer();

    Obstacle makeObstacle();
}