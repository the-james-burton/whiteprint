package com.googlecode.whiteprint.tip.composite;

import org.junit.Test;

public class CompositeStructureTest {
    @Test
    public void test() {
	final Node root = new Node("root");
	root.add(new Leaf("Leaf1"));
	Node c2 = new Node("Node1");
	c2.add(new Leaf("Leaf2"));
	c2.add(new Leaf("Leaf3"));
	root.add(c2);
	c2 = new Node("Node2");
	c2.add(new Leaf("Leaf4"));
	c2.add(new Leaf("Leaf5"));
	root.add(c2);
	root.operation();
    }
}