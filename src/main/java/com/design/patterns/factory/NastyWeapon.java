package com.design.patterns.factory;

class NastyWeapon implements Obstacle {
    @Override
    public void action() {
	System.out.println("NastyWeapon");
    }
}