package com.design.patterns.builder;

class MagazineBuilder extends MediaBuilder {
  private Magazine m;
  public void buildBase() {
    System.out.println("Building magazine framework");
    m = new Magazine();
  }
  public void addMediaItem(MediaItem article) {
    System.out.println("Adding article " + article);
    m.add(article);
  }
  public Media getFinishedMedia() { return m; }
}