package com.design.patterns.builder;

import java.util.List;

class MediaDirector { // a.k.a. "Context"
    private final MediaBuilder mb;

    public MediaDirector(final MediaBuilder mb) {
	this.mb = mb; // Strategy-ish
    }

    public Media produceMedia(final List<?> input) {
	this.mb.buildBase();
	for (Object element : input) {
	    this.mb.addMediaItem((MediaItem) element);
	}
	return this.mb.getFinishedMedia();
    }
}