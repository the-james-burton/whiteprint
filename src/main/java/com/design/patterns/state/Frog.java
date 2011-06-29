package com.design.patterns.state;

class Frog implements State {
    @Override
    public String response() {
	return "Ribbet!";
    }
}