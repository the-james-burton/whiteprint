package com.design.concurrency.synchronizers;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

class Sync extends AbstractQueuedSynchronizer {
    protected int tryAcquireShared(int ignored) {
        // Succeed if latch is open (state == 1), else fail
        return (getState() == 1) ? 1 : -1;
    }

    protected boolean tryReleaseShared(int ignored) {
        setState(1); // Latch is now open
        return true; // Other threads may now be able to acquire

    }
}