package com.googlecode.whiteprint.tip.command;

import java.util.ArrayList;
import java.util.List;

class Macro {
    private final List<Command> commands = new ArrayList<Command>();

    public void add(final Command c) {
	this.commands.add(c);
    }

    public void run() {
	for (Command command : this.commands) {
	    command.execute();
	}

    }
}