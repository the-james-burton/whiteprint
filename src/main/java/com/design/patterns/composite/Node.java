package com.design.patterns.composite;

import java.util.ArrayList;
import java.util.Iterator;

class Node extends ArrayList implements Component {
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
	System.out.println(this);
	for (final Iterator it = iterator(); it.hasNext();) {
	    ((Component) it.next()).operation();
	}
    }

    @Override
    public String toString() {
	return this.name;
    }
}