package com.googlecode.whiteprint.jcip.task;

import java.util.TimerTask;

public class ThrowTask extends TimerTask {
    public void run() {
        throw new RuntimeException();
    }
}