package com.design.patterns.singleton;

class PoolItem {
    boolean inUse = false;
    Object item;

    PoolItem(final Object item) {
        this.item = item;
    }
}