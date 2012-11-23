package com.design.concurrency.sharing;

public interface EventSource {
    void registerListener(EventListener e);
}