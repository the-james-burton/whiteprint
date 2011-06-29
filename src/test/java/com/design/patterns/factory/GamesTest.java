package com.design.patterns.factory;

import org.junit.Test;

public class GamesTest {
    GameElementFactory kp = new KittiesAndPuzzles(),
	    kd = new KillAndDismember();
    GameEnvironment g1 = new GameEnvironment(this.kp),
	    g2 = new GameEnvironment(this.kd);

    // These just ensure no exceptions are thrown:
    @Test
    public void test1() {
	this.g1.play();
    }

    @Test
    public void test2() {
	this.g2.play();
    }
}