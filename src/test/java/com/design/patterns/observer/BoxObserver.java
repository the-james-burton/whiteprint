// : observer:BoxObserver.java
// Demonstration of Observer pattern using
// Java's built-in observer classes.
package com.design.patterns.observer;

import java.awt.Container;
import java.awt.GridLayout;
import java.util.Observable;

import javax.swing.JFrame;

public class BoxObserver extends JFrame {
    private static final long serialVersionUID = -4960193417089067559L;

    public static void main(final String... args) {
	int grid = 8;
	if (args.length > 0) {
	    grid = Integer.parseInt(args[0]);
	}
	final JFrame f = new BoxObserver(grid);
	f.setSize(500, 400);
	f.setVisible(true);
	f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    Observable notifier = new BoxObservable();

    public BoxObserver(final int grid) {
	setTitle("Demonstrates Observer pattern");
	final Container cp = getContentPane();
	cp.setLayout(new GridLayout(grid, grid));
	for (int x = 0; x < grid; x++) {
	    for (int y = 0; y < grid; y++) {
		cp.add(new OCBox(x, y, this.notifier));
	    }
	}
    }
}
