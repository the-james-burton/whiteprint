package com.googlecode.whiteprint.tip.flyweight;

class ExternalizedData {
    static final int size = 5000000;
    static int[] id = new int[size];
    static int[] i = new int[size];
    static float[] f = new float[size];
    static {
	for (int i = 0; i < size; i++) {
	    id[i] = i;
	}
    }
}