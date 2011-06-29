package com.design.patterns.command;

class Hello implements Command {
    @Override
    public void execute() {
	System.out.print("Hello ");
    }
}