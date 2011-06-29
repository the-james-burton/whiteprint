package com.design.patterns.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

// Since this isn't inherited from a Cloneable
// base class and cloneability isn't added,
// making it final prevents cloneability from
// being added through inheritance:
public class SingletonPattern {
    @Test
    public void test() {
        Singleton s = Singleton.getReference();
        String result = "" + s.getValue();
        System.out.println(result);
        assertEquals(result, "47");
        Singleton s2 = Singleton.getReference();
        s2.setValue(9);
        result = "" + s.getValue();
        System.out.println(result);
        assertEquals(result, "9");
        try {
            // Can't do this: compile-time error.
            // Singleton s3 = (Singleton)s2.clone();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
