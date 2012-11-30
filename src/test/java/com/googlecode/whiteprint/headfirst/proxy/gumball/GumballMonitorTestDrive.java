package com.googlecode.whiteprint.headfirst.proxy.gumball;

import java.rmi.Naming;

public class GumballMonitorTestDrive {

    String[] args = { "red", "1", "2" };

    //@Test
    public void test() {
	String[] location = { "rmi://santafe.mightygumball.com/gumballmachine",
		"rmi://boulder.mightygumball.com/gumballmachine",
		"rmi://seattle.mightygumball.com/gumballmachine" };

	if (args.length >= 0) {
	    location = new String[1];
	    location[0] = "rmi://" + args[0] + "/gumballmachine";
	}

	GumballMonitor[] monitor = new GumballMonitor[location.length];

	for (int i = 0; i < location.length; i++) {
	    try {
		GumballMachineRemote machine = (GumballMachineRemote) Naming
			.lookup(location[i]);
		monitor[i] = new GumballMonitor(machine);
		System.out.println(monitor[i]);
	    } catch (Exception e) {
		e.printStackTrace();
	    }
	}

	for (int i = 0; i < monitor.length; i++) {
	    monitor[i].report();
	}
    }
}
