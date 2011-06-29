package com.design.patterns.flyweight;

class FlyPoint {
    private FlyPoint() {
    }

    public static int getI(int obnum) {
        return ExternalizedData.i[obnum];
    }

    public static void setI(int obnum, int i) {
        ExternalizedData.i[obnum] = i;
    }

    public static float getF(int obnum) {
        return ExternalizedData.f[obnum];
    }

    public static void setF(int obnum, float f) {
        ExternalizedData.f[obnum] = f;
    }

    public static String str(int obnum) {
        return "id: " + ExternalizedData.id[obnum] + ", i = " + ExternalizedData.i[obnum] + ", f = " + ExternalizedData.f[obnum];
    }
}