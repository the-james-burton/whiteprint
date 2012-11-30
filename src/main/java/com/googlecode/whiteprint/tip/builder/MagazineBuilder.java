package com.googlecode.whiteprint.tip.builder;

import java.util.logging.Logger;

class MagazineBuilder extends MediaBuilder {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    private Magazine m;

    @Override
    public void addMediaItem(final MediaItem article) {
	log.info("Adding article " + article);
	this.m.add(article);
    }

    @Override
    public void buildBase() {
	log.info("Building magazine framework");
	this.m = new Magazine();
    }

    @Override
    public Media getFinishedMedia() {
	return this.m;
    }
}