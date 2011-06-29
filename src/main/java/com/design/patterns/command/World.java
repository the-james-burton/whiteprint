package com.design.patterns.command;

class World implements Command {
    @Override
    public void execute() {
	System.out.print("World! ");
    }
}