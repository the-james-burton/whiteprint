package com.googlecode.whiteprint.tip.builder;

import java.util.logging.Logger;

class WebSiteBuilder extends MediaBuilder {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    private WebSite w;

    @Override
    public void addMediaItem(final MediaItem webItem) {
	log.info("Adding web item " + webItem);
	this.w.add(webItem);
    }

    @Override
    public void buildBase() {
	log.info("Building web site framework");
	this.w = new WebSite();
    }

    @Override
    public Media getFinishedMedia() {
	return this.w;
    }
}