package com.googlecode.whiteprint.jcip.composing;

import com.googlecode.whiteprint.jcip.annotations.GuardedBy;
import com.googlecode.whiteprint.jcip.annotations.ThreadSafe;

/**
 * Counter
 * <p/>
 * Simple thread-safe counter using the Java monitor pattern
 *
 * @author Brian Goetz and Tim Peierls
 */
@ThreadSafe
public final class Counter {
    @GuardedBy("this") private long value = 0;

    public synchronized long getValue() {
        return value;
    }

    public synchronized long increment() {
        if (value == Long.MAX_VALUE)
            throw new IllegalStateException("counter overflow");
        return ++value;
    }
}
