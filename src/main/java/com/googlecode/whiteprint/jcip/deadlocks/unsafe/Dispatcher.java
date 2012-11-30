package com.googlecode.whiteprint.jcip.deadlocks.unsafe;

import java.util.HashSet;
import java.util.Set;

import com.googlecode.whiteprint.jcip.annotations.GuardedBy;
import com.googlecode.whiteprint.jcip.deadlocks.Image;
import com.googlecode.whiteprint.jcip.deadlocks.unsafe.CooperatingDeadlock.Taxi;

class Dispatcher {
    @GuardedBy("this") private final Set<Taxi> taxis;
    @GuardedBy("this") private final Set<Taxi> availableTaxis;

    public Dispatcher() {
        taxis = new HashSet<Taxi>();
        availableTaxis = new HashSet<Taxi>();
    }

    public synchronized void notifyAvailable(Taxi taxi) {
        availableTaxis.add(taxi);
    }

    public synchronized Image getImage() {
        Image image = new Image();
        for (Taxi t : taxis)
            image.drawMarker(t.getLocation());
        return image;
    }
}