package com.design.concurrency.ui;

import java.util.concurrent.Callable;

public class ComputationTask <V> implements Callable<V> {

    private final BackgroundTask <V> backgroundTask;

    public ComputationTask(BackgroundTask <V> backgroundTask) {
	this.backgroundTask = backgroundTask;
    }
    
    @Override
    public V call() throws Exception {
	return backgroundTask.compute();
    }

}
