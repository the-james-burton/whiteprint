package com.googlecode.whiteprint.headfirst.command.undo;

public interface Command {
	public void execute();
	public void undo();
}
