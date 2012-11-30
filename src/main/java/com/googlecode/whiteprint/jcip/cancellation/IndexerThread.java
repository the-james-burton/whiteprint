package com.googlecode.whiteprint.jcip.cancellation;

import java.io.File;
import java.util.concurrent.BlockingQueue;

class IndexerThread extends Thread {

    private final BlockingQueue<File> queue;

    public IndexerThread(BlockingQueue<File> queue) {
	this.queue = queue;
    }

    public void run() {
        try {
            while (true) {
                File file = queue.take();
                if (file == IndexingService.POISON)
                    break;
                else
                    indexFile(file);
            }
        } catch (InterruptedException consumed) {
        }
    }

    public void indexFile(File file) {
        /*...*/
    };
}