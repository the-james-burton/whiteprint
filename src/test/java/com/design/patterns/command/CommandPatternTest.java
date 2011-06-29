package com.design.patterns.command;

import org.junit.Test;

public class CommandPatternTest {
    Macro macro = new Macro();

    @Test
    public void test() {
	this.macro.add(new Hello());
	this.macro.add(new World());
	this.macro.add(new IAm());
	this.macro.run();
    }
}
