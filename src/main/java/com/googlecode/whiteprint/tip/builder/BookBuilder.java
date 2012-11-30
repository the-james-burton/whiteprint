package com.googlecode.whiteprint.tip.builder;

import java.util.logging.Logger;

class BookBuilder extends MediaBuilder {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    private Book b;

    @Override
    public void addMediaItem(final MediaItem chapter) {
	log.info("Adding chapter " + chapter);
	this.b.add(chapter);
    }

    @Override
    public void buildBase() {
	log.info("Building book framework");
	this.b = new Book();
    }

    @Override
    public Media getFinishedMedia() {
	return this.b;
    }
}