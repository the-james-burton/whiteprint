package com.design.patterns.builder;

import java.util.Iterator;
import java.util.List;

class MediaDirector { // a.k.a. "Context"
    private final MediaBuilder mb;

    public MediaDirector(final MediaBuilder mb) {
	this.mb = mb; // Strategy-ish
    }

    public Media produceMedia(final List input) {
	this.mb.buildBase();
	for (final Iterator it = input.iterator(); it.hasNext();) {
	    this.mb.addMediaItem((MediaItem) it.next());
	}
	return this.mb.getFinishedMedia();
    }
}