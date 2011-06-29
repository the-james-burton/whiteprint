package com.design.patterns.builder;

class MediaItem {
    private final String s;

    public MediaItem(final String s) {
	this.s = s;
    }

    @Override
    public String toString() {
	return this.s;
    }
}