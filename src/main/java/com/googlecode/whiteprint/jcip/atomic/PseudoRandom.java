package com.googlecode.whiteprint.jcip.atomic;

public class PseudoRandom {

    public int calculateNext(int value) {
	value = value * value;
	String result = Long.toString(value);
	while (result.length() != 16)
	    result = result + "0";
	String newResult = result.substring(4, 12);
	value = Integer.parseInt(newResult);
	return value;
    }

}
