package com.design.patterns.command;

class Hello implements Command {
    public void execute() {
        System.out.print("Hello ");
    }
}