package com.design.example;
import static org.junit.Assert.assertNotNull;

import java.util.logging.Logger;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests for our basic test class
 */
public class InformationTest {
    /** Standard java logging */
    Logger      log = Logger.getLogger(this.getClass().getName());
    /** Reference to our class under test */
    Information information;

    /**
     * JUnit 4 Before method, runs before the tests
     */
    @Before
    public void before() {
        information = new Information();
    }

    /**
     * simple test of the ping() method
     */
    @Test
    public void information() {
        Long ping = information.ping();
        assertNotNull(ping);
        log.info(ping.toString());
    }
}
