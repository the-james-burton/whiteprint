package com.design.patterns.state;

import org.junit.Test;

public class KissingPrincessTest {
    Beast beast = new Beast();

    @Test
    public void test() {
        beast.greet();
        beast.kiss();
        beast.greet();
    }
}