package com.design.patterns.command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Macro {
    private List commands = new ArrayList();

    public void add(Command c) {
        commands.add(c);
    }

    public void run() {
        Iterator it = commands.iterator();
        while (it.hasNext())
            ((Command) it.next()).execute();
    }
}