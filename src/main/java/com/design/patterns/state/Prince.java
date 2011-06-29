package com.design.patterns.state;

class Prince implements State {
    @Override
    public String response() {
	return "Darling!";
    }
}