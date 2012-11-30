package com.googlecode.whiteprint.example.roman;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanNumeralTest {

    @Test
    public void testRomanNumeral() {
	RomanNumeral _1666 = new RomanNumeral("MDCLXVI");
	assertEquals(_1666.getValue(), 1666);
	RomanNumeral _1910 = new RomanNumeral("MDCCCCX");
	assertEquals(_1910.getValue(), 1910);
	RomanNumeral _1954  = new RomanNumeral("MCMLIV");
	assertEquals(_1954.getValue(), 1954);
	RomanNumeral _1990 = new RomanNumeral("MCMXC");
	assertEquals(_1990.getValue(), 1990);
	RomanNumeral _1999a = new RomanNumeral("MCMXCIX");
	assertEquals(_1999a.getValue(), 1999);
	RomanNumeral _1999b = new RomanNumeral("MDCCCCLXXXXVIIII");
	assertEquals(_1999b.getValue(), 1999);
	RomanNumeral _1999c = new RomanNumeral("MDCDLXLVIV");
	assertEquals(_1999c.getValue(), 1999);
    }

}
