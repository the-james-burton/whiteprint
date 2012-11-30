package com.googlecode.whiteprint.headfirst.adapter.ducks;

import org.junit.Test;

public class DuckTestDrive {

    @Test
    public void test() {
	MallardDuck duck = new MallardDuck();

	WildTurkey turkey = new WildTurkey();
	Duck turkeyAdapter = new TurkeyAdapter(turkey);

	System.out.println("The Turkey says...");
	turkey.gobble();
	turkey.fly();

	System.out.println("\nThe Duck says...");
	testDuck(duck);

	System.out.println("\nThe TurkeyAdapter says...");
	testDuck(turkeyAdapter);
    }

    private void testDuck(Duck duck) {
	duck.quack();
	duck.fly();
    }
}
