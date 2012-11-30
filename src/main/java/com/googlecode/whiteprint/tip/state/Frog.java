package com.googlecode.whiteprint.tip.state;

class Frog implements State {
    @Override
    public String response() {
	return "Ribbet!";
    }
}