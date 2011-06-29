package com.design.patterns.builder;

class BookBuilder extends MediaBuilder {
    private Book b;

    @Override
    public void addMediaItem(final MediaItem chapter) {
	System.out.println("Adding chapter " + chapter);
	this.b.add(chapter);
    }

    @Override
    public void buildBase() {
	System.out.println("Building book framework");
	this.b = new Book();
    }

    @Override
    public Media getFinishedMedia() {
	return this.b;
    }
}