package com.design.patterns.flyweight;

class DataPoint {
    private static int count = 0;
    private int        id    = count++;
    private int        i;
    private float      f;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }

    public String toString() {
        return "id: " + id + ", i = " + i + ", f = " + f;
    }
}