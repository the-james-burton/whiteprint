package com.design.concurrency.deadlocks.unsafe;

import java.util.HashSet;
import java.util.Set;

import com.design.concurrency.annotations.GuardedBy;
import com.design.concurrency.deadlocks.Image;
import com.design.concurrency.deadlocks.unsafe.CooperatingDeadlock.Taxi;

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