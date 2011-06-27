package com.design.example;


/**
 * Test class to be used for various purposes.
 */
public class Information {
    /**
     * Method to indicate sucessful compilation and execution.
     * 
     * @return Returns the current value of the most precise available system timer, in nanoseconds.
     */
    public final Long ping() {
        return System.nanoTime();
    }
}
