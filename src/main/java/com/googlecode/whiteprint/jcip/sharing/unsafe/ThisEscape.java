package com.googlecode.whiteprint.jcip.sharing.unsafe;

import com.googlecode.whiteprint.jcip.sharing.Event;
import com.googlecode.whiteprint.jcip.sharing.EventListener;
import com.googlecode.whiteprint.jcip.sharing.EventSource;

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

