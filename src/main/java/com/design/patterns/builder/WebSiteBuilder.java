package com.design.patterns.builder;

class WebSiteBuilder extends MediaBuilder {
    private WebSite w;

    @Override
    public void addMediaItem(final MediaItem webItem) {
	System.out.println("Adding web item " + webItem);
	this.w.add(webItem);
    }

    @Override
    public void buildBase() {
	System.out.println("Building web site framework");
	this.w = new WebSite();
    }

    @Override
    public Media getFinishedMedia() {
	return this.w;
    }
}