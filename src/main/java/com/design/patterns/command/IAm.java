package com.design.patterns.command;

class IAm implements Command {
    @Override
    public void execute() {
	System.out.print("I'm the command pattern!");
    }
}