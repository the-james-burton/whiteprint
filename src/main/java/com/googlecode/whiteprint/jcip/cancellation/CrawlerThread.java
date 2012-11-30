package com.googlecode.whiteprint.jcip.cancellation;

import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.BlockingQueue;

class CrawlerThread extends Thread {

    private final BlockingQueue<File> queue;
    private final FileFilter fileFilter;
    private final File root;

    public CrawlerThread(BlockingQueue<File> queue, FileFilter fileFilter, File root) {
	this.queue = queue;
	this.fileFilter = fileFilter;
	this.root = root;
    }

    public void run() {
        try {
            crawl(root);
        } catch (InterruptedException e) { /* fall through */
        } finally {
            while (true) {
                try {
                    queue.put(IndexingService.POISON);
                    break;
                } catch (InterruptedException e1) { /* retry */
                }
            }
        }
    }

    private void crawl(File root) throws InterruptedException {
        File[] entries = root.listFiles(fileFilter);
        if (entries != null) {
            for (File entry : entries) {
                if (entry.isDirectory())
                    crawl(entry);
                else if (!alreadyIndexed(entry))
                    queue.put(entry);
            }
        }
    }
    
    private boolean alreadyIndexed(File f) {
        return false;
    }
}
