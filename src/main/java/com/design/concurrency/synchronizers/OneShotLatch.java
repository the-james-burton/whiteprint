package com.design.concurrency.synchronizers;

import com.design.concurrency.annotations.ThreadSafe;

/**
 * OneShotLatch
 * <p/>
 * Binary latch using AbstractQueuedSynchronizer
 *
 * @author Brian Goetz and Tim Peierls
 */
@ThreadSafe
public class OneShotLatch {
    private final Sync sync = new Sync();

    public void signal() {
        sync.releaseShared(0);
    }

    public void await() throws InterruptedException {
        sync.acquireSharedInterruptibly(0);
    }


}
