package com.design.patterns.command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Macro {
    private final List<Command> commands = new ArrayList<Command>();

    public void add(final Command c) {
	this.commands.add(c);
    }

    public void run() {
	final Iterator<Command> it = this.commands.iterator();
	while (it.hasNext()) {
	    ((Command) it.next()).execute();
	}
    }
}