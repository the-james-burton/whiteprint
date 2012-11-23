package com.design.concurrency.sharing.unsafe;

import com.design.concurrency.sharing.Event;
import com.design.concurrency.sharing.EventListener;
import com.design.concurrency.sharing.EventSource;

/**
 * ThisEscape
 * <p/>
 * Implicitly allowing the this reference to escape
 *
 * @author Brian Goetz and Tim Peierls
 */
public class ThisEscape {
    public ThisEscape(EventSource source) {
        source.registerListener(new EventListener() {
            public void onEvent(Event e) {
                doSomething(e);
            }
        });
    }

    void doSomething(Event e) {
    }

}

