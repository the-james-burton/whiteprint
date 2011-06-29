package com.design.patterns.builder;

class MagazineBuilder extends MediaBuilder {
    private Magazine m;

    @Override
    public void addMediaItem(final MediaItem article) {
	System.out.println("Adding article " + article);
	this.m.add(article);
    }

    @Override
    public void buildBase() {
	System.out.println("Building magazine framework");
	this.m = new Magazine();
    }

    @Override
    public Media getFinishedMedia() {
	return this.m;
    }
}