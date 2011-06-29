package com.design.patterns.singleton;

import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;

import org.junit.Test;

// Since this isn't inherited from a Cloneable
// base class and cloneability isn't added,
// making it final prevents cloneability from
// being added through inheritance:
public class SingletonPatternTest {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Test
    public void test() {
	final Singleton s = Singleton.getReference();
	String result = "" + s.getValue();
	log.info(result);
	assertEquals(result, "47");
	final Singleton s2 = Singleton.getReference();
	s2.setValue(9);
	result = "" + s.getValue();
	log.info(result);
	assertEquals(result, "9");
	try {
	    // Can't do this: compile-time error.
	    // Singleton s3 = (Singleton)s2.clone();
	} catch (final Exception e) {
	    throw new RuntimeException(e);
	}
    }
}
