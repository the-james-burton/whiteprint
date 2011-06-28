package com.design.patterns.builder;

class BookBuilder extends MediaBuilder {
  private Book b;
  public void buildBase() {
    System.out.println("Building book framework");
    b = new Book();
  }
  public void addMediaItem(MediaItem chapter) {
    System.out.println("Adding chapter " + chapter);
    b.add(chapter);
  }
  public Media getFinishedMedia() { return b; }
}