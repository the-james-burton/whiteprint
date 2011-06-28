package com.design.patterns.builder;

import java.util.Iterator;
import java.util.List;

class MediaDirector { // a.k.a. "Context"
    private MediaBuilder mb;

    public MediaDirector(MediaBuilder mb) {
        this.mb = mb; // Strategy-ish
    }

    public Media produceMedia(List input) {
        mb.buildBase();
        for (Iterator it = input.iterator(); it.hasNext();)
            mb.addMediaItem((MediaItem) it.next());
        return mb.getFinishedMedia();
    }
}