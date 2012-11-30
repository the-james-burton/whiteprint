package com.googlecode.whiteprint.jcip.introduction;

import com.googlecode.whiteprint.jcip.annotations.GuardedBy;
import com.googlecode.whiteprint.jcip.annotations.ThreadSafe;

/**
 * Sequence
 *
 * @author Brian Goetz and Tim Peierls
 */

@ThreadSafe
public class Sequence {
    @GuardedBy("this") private int nextValue;

    public synchronized int getNext() {
        return nextValue++;
    }
}
