package com.googlecode.whiteprint.headfirst.templatemethod.sort;

import java.util.Arrays;

import org.junit.Test;

public class DuckSortTestDrive {

    @Test
    public void test() {
	Duck[] ducks = { new Duck("Daffy", 8), new Duck("Dewey", 2),
		new Duck("Howard", 7), new Duck("Louie", 2),
		new Duck("Donald", 10), new Duck("Huey", 2) };

	System.out.println("Before sorting:");
	display(ducks);

	Arrays.sort(ducks);

	System.out.println("\nAfter sorting:");
	display(ducks);
    }

    private void display(Duck[] ducks) {
	for (int i = 0; i < ducks.length; i++) {
	    System.out.println(ducks[i]);
	}
    }
}
