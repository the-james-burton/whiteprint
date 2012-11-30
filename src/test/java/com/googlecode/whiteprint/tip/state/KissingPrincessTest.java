package com.googlecode.whiteprint.tip.state;

import org.junit.Test;

public class KissingPrincessTest {
    Beast beast = new Beast();

    @Test
    public void test() {
	this.beast.greet();
	this.beast.kiss();
	this.beast.greet();
    }
}
