package com.googlecode.whiteprint.tip.flyweight;

class FlyPoint {
    public static float getF(final int obnum) {
	return ExternalizedData.f[obnum];
    }

    public static int getI(final int obnum) {
	return ExternalizedData.i[obnum];
    }

    public static void setF(final int obnum, final float f) {
	ExternalizedData.f[obnum] = f;
    }

    public static void setI(final int obnum, final int i) {
	ExternalizedData.i[obnum] = i;
    }

    public static String str(final int obnum) {
	return "id: " + ExternalizedData.id[obnum] + ", i = "
		+ ExternalizedData.i[obnum] + ", f = "
		+ ExternalizedData.f[obnum];
    }

    private FlyPoint() {
    }
}