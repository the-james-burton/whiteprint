package com.design.patterns.composite;

import java.util.ArrayList;
import java.util.Iterator;

class Node extends ArrayList implements Component {
    private String name;

    public Node(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public void operation() {
        System.out.println(this);
        for (Iterator it = iterator(); it.hasNext();)
            ((Component) it.next()).operation();
    }
}