package com.googlecode.whiteprint.tip.proxy;

class PoolItem {
    boolean inUse = false;
    Object item;

    PoolItem(final Object item) {
        this.item = item;
    }
}