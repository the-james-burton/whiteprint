package com.design.patterns.builder;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BuildMedia {
    private final List input = Arrays.asList(new MediaItem[] { new MediaItem("item1"), new MediaItem("item2"), new MediaItem("item3"), new MediaItem("item4"), });

    @Test
    public void testBook() {
        MediaDirector buildBook = new MediaDirector(new BookBuilder());
        Media book = buildBook.produceMedia(input);
        String result = "book: " + book;
        System.out.println(result);
        assertEquals(result, "book: [item1, item2, item3, item4]");
    }

    @Test
    public void testMagazine() {
        MediaDirector buildMagazine = new MediaDirector(new MagazineBuilder());
        Media magazine = buildMagazine.produceMedia(input);
        String result = "magazine: " + magazine;
        System.out.println(result);
        assertEquals(result, "magazine: [item1, item2, item3, item4]");
    }

    @Test
    public void testWebSite() {
        MediaDirector buildWebSite = new MediaDirector(new WebSiteBuilder());
        Media webSite = buildWebSite.produceMedia(input);
        String result = "web site: " + webSite;
        System.out.println(result);
        assertEquals(result, "web site: [item1, item2, item3, item4]");
    }
}
