package com.googlecode.whiteprint.jcip.sharing.unsafe;

public class ReaderThread extends Thread {

    public static boolean ready;
    public static int number;

    public void run() {
        while (!ready)
            Thread.yield();
        System.out.println(number);
    }
}