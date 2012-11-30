package com.googlecode.whiteprint.headfirst.combined.djview;

import org.junit.Test;

public class DJTestDrive {

    @Test
    public void test() {
	BeatModelInterface model = new BeatModel();
	ControllerInterface controller = new BeatController(model);
    }
}
