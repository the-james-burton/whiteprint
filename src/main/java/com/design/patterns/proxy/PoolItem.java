package com.design.patterns.proxy;

class PoolItem {
    boolean inUse = false;
    Object item;

    PoolItem(final Object item) {
        this.item = item;
    }
}