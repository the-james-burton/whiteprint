package com.design.patterns.composite;

class Leaf implements Component {
    private final String name;

    public Leaf(final String name) {
	this.name = name;
    }

    @Override
    public void operation() {
	System.out.println(this);
    }

    @Override
    public String toString() {
	return this.name;
    }
}