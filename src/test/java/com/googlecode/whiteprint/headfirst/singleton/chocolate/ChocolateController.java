package com.googlecode.whiteprint.headfirst.singleton.chocolate;

import org.junit.Test;

public class ChocolateController {

    @Test
    public void test() {
	ChocolateBoiler boiler = ChocolateBoiler.getInstance();
	boiler.fill();
	boiler.boil();
	boiler.drain();

	// will return the existing instance
	ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
    }
}
