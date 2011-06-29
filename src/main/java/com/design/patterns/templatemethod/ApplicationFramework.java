package com.design.patterns.templatemethod;

import java.util.logging.Logger;

abstract class ApplicationFramework {
    /** Standard java logging */
    protected final Logger log = Logger.getLogger(this.getClass().getName());

    public ApplicationFramework() {
	templateMethod(); // Dangerous!
    }

    abstract void customize1();

    abstract void customize2();

    final void templateMethod() {
	for (int i = 0; i < 5; i++) {
	    customize1();
	    customize2();
	}
    }
}