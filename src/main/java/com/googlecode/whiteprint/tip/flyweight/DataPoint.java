package com.googlecode.whiteprint.tip.flyweight;

class DataPoint {
    private static int count = 0;
    private final int id = count++;
    private int i;
    private float f;

    public float getF() {
	return this.f;
    }

    public int getI() {
	return this.i;
    }

    public void setF(final float f) {
	this.f = f;
    }

    public void setI(final int i) {
	this.i = i;
    }

    @Override
    public String toString() {
	return "id: " + this.id + ", i = " + this.i + ", f = " + this.f;
    }
}