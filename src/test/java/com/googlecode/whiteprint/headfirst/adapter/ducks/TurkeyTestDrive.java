package com.googlecode.whiteprint.headfirst.adapter.ducks;

import org.junit.Test;

public class TurkeyTestDrive {

    @Test
    public void test() {
	MallardDuck duck = new MallardDuck();
	Turkey duckAdapter = new DuckAdapter(duck);

	for (int i = 0; i < 10; i++) {
	    System.out.println("The DuckAdapter says...");
	    duckAdapter.gobble();
	    duckAdapter.fly();
	}
    }
}
