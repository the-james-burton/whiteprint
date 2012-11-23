package com.design.concurrency.task;

import java.util.concurrent.Callable;

class FetchAdTask implements Callable<Ad> {
    public Ad call() {
        return new Ad();
    }
}