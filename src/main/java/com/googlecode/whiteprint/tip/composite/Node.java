package com.googlecode.whiteprint.tip.composite;

import java.util.ArrayList;
import java.util.logging.Logger;

class Node extends ArrayList<Component> implements Component {
    /** Standard java logging */
    private final Logger log = Logger.getLogger(this.getClass().getName());

    /**
     * 
     */
    private static final long serialVersionUID = 4393916403308761555L;
    private final String name;

    public Node(final String name) {
	this.name = name;
    }

    @Override
    public void operation() {
	log.info(this.toString());
	for (Component component : this) {
	    component.operation();
	}
    }

    @Override
    public String toString() {
	return this.name;
    }
}