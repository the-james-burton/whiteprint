package com.googlecode.whiteprint.headfirst.state.gumballstatewinner;

import org.junit.Test;

public class GumballMachineTestDrive {

    @Test
    public void test() {
	GumballMachine gumballMachine = new GumballMachine(10);

	System.out.println(gumballMachine);

	gumballMachine.insertQuarter();
	gumballMachine.turnCrank();
	gumballMachine.insertQuarter();
	gumballMachine.turnCrank();

	System.out.println(gumballMachine);

	gumballMachine.insertQuarter();
	gumballMachine.turnCrank();
	gumballMachine.insertQuarter();
	gumballMachine.turnCrank();

	System.out.println(gumballMachine);

	gumballMachine.insertQuarter();
	gumballMachine.turnCrank();
	gumballMachine.insertQuarter();
	gumballMachine.turnCrank();

	System.out.println(gumballMachine);

	gumballMachine.insertQuarter();
	gumballMachine.turnCrank();
	gumballMachine.insertQuarter();
	gumballMachine.turnCrank();

	System.out.println(gumballMachine);

	gumballMachine.insertQuarter();
	gumballMachine.turnCrank();
	gumballMachine.insertQuarter();
	gumballMachine.turnCrank();

	System.out.println(gumballMachine);
    }
}
