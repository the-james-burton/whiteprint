package com.googlecode.whiteprint.example.zebra;

import java.util.List;

public class Array<T extends Enum<T>> {
    private List<T> list;
    private Class<?> clazz;

    public Array(List<T> list) {
	this.list = list;
	this.clazz = list.get(0).getClass();
    }

    public int indexOf(T value) {
	for (int i = 0; i < list.size(); i++) {
	    if (value == list.get(i))
		return i;
	}
	throw new IllegalArgumentException("no such value: " + value);
    }

    public List<T> getList() {
	return list;
    }

    public T valueAt(int index) {
	if (0 <= index && index < list.size()) {
	    return list.get(index);
	} else {
	    return null;
	}
    }

    public String toString() {
	return this.getClass().getSimpleName() + list.toString();
    }
}