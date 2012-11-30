package com.googlecode.whiteprint.example.roman;

import java.util.ArrayList;
import java.util.List;

public class RomanNumeral {

    private int value;
    private List<RomanDigit> digits = new ArrayList<RomanDigit>();

    public RomanNumeral(String text) {
	parse(text);
    }

    private void parse(String text) {
	// first pass...
	List<RomanDigit> first = new ArrayList<RomanDigit>();
	for (char c : text.toCharArray()) {
	    RomanDigit digit = RomanDigit.valueOf(String.valueOf(c));
	    first.add(digit);
	}
	// second pass...
	for (int i = 0; i <= first.size()-1; i++) {
	    RomanDigit current = first.get(i);
	    RomanDigit next = null;
	    if (i < first.size() - 1) {
		next = first.get(i + 1);
	    }
	    if (next == null || current.getValue() >= next.getValue()) {
		digits.add(current);
	    } else {
		RomanDigit composite = RomanDigit.valueOf(current.getNumeral() + next.getNumeral());
		digits.add(composite);
		i++;	
	    }
	}
	// calculate value...
	for (RomanDigit digit : digits) {
	    value = value + digit.getValue();
	}
    }

    public int getValue() {
	return value;
    }

    @Override
    public String toString() {
	StringBuilder sb = new StringBuilder();
	for (RomanDigit digit : digits) {
	    sb.append(digit);
	}
	return sb.toString();
    }

}
