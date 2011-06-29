package com.design.patterns.composite;

import java.util.ArrayList;

class Node extends ArrayList<Component> implements Component {
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
	for (Component component : this) {
	    component.operation();
	}
    }

    @Override
    public String toString() {
	return this.name;
    }
}