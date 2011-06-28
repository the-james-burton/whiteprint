package com.design.patterns.command;

class World implements Command {
    public void execute() {
        System.out.print("World! ");
    }
}