package com.googlecode.whiteprint.headfirst.combined.djview;

import org.junit.Test;

public class HeartTestDrive {

    @Test
    public void test() {
	HeartModel heartModel = new HeartModel();
	ControllerInterface model = new HeartController(heartModel);
    }
}
