package com.design.patterns.builder;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.junit.Test;

public class BuildMediaTest {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    private final List<MediaItem> input = Arrays.asList(new MediaItem[] {
	    new MediaItem("item1"), new MediaItem("item2"),
	    new MediaItem("item3"), new MediaItem("item4"), });

    @Test
    public void testBook() {
	final MediaDirector buildBook = new MediaDirector(new BookBuilder());
	final Media book = buildBook.produceMedia(this.input);
	final String result = "book: " + book;
	log.info(result);
	assertEquals(result, "book: [item1, item2, item3, item4]");
    }

    @Test
    public void testMagazine() {
	final MediaDirector buildMagazine = new MediaDirector(
		new MagazineBuilder());
	final Media magazine = buildMagazine.produceMedia(this.input);
	final String result = "magazine: " + magazine;
	log.info(result);
	assertEquals(result, "magazine: [item1, item2, item3, item4]");
    }

    @Test
    public void testWebSite() {
	final MediaDirector buildWebSite = new MediaDirector(
		new WebSiteBuilder());
	final Media webSite = buildWebSite.produceMedia(this.input);
	final String result = "web site: " + webSite;
	log.info(result);
	assertEquals(result, "web site: [item1, item2, item3, item4]");
    }
}
