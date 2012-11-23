package com.design.example.roman;

public enum RomanDigit {

    I("I", 1),
    IV("IV", 4),
    V("V", 5),
    IX("IX", 9),
    X("X", 10),
    XL("L", 40),
    L("L", 50),
    XC("C", 90),
    C("C", 100),
    CD("D", 400),
    D("D", 500),
    CM("M", 900),
    M("M", 1000);

    private final String numeral;
    private final int value;

    RomanDigit(String numeral, int value) {
        this.numeral = numeral;
        this.value = value;
    }

    public String getNumeral() {
        return numeral;
    }

    public int getValue() {
        return value;
    }
    
}
