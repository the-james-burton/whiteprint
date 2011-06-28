package com.design.patterns.builder;

class WebSiteBuilder extends MediaBuilder {
    private WebSite w;

    public void buildBase() {
        System.out.println("Building web site framework");
        w = new WebSite();
    }

    public void addMediaItem(MediaItem webItem) {
        System.out.println("Adding web item " + webItem);
        w.add(webItem);
    }

    public Media getFinishedMedia() {
        return w;
    }
}