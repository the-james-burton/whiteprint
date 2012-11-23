package com.design.concurrency.cancellation;

import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * IndexingService
 * <p/>
 * Shutdown with poison pill
 *
 * @author Brian Goetz and Tim Peierls
 */
public class IndexingService {
    private static final int CAPACITY = 1000;
    public static final File POISON = new File("");
    private final IndexerThread consumer;
    private final CrawlerThread producer;
    private final BlockingQueue<File> queue;
    private final FileFilter fileFilter;
    private final File root;

    public IndexingService(File root, final FileFilter fileFilter) {
        this.root = root;
        this.queue = new LinkedBlockingQueue<File>(CAPACITY);
        this.fileFilter = new FileFilter() {
            public boolean accept(File f) {
                return f.isDirectory() || fileFilter.accept(f);
            }
        };
        this.consumer = new IndexerThread(queue);
        this.producer = new CrawlerThread(queue, fileFilter, root);
    }

    public void start() {
        producer.start();
        consumer.start();
    }

    public void stop() {
        producer.interrupt();
    }

    public void awaitTermination() throws InterruptedException {
        consumer.join();
    }
}
