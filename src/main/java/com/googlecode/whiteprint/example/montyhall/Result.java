package com.googlecode.whiteprint.example.montyhall;

public class Result {

    private int won = 0;
    private int swapped = 0;
    private int wonAndSwapped = 0;
    private int wonAndStayed = 0;
    
    public int getWon() {
        return won;
    }
    public void won() {
        won++;
    }
    public int getSwapped() {
        return swapped;
    }
    public void swapped() {
        swapped++;
    }
    public int getWonAndSwapped() {
        return wonAndSwapped;
    }
    public void wonAndSwapped() {
	wonAndSwapped++;
    }
    public int getWonAndStayed() {
        return wonAndStayed;
    }
    public void wonAndStayed() {
        wonAndStayed++;
    }

}
