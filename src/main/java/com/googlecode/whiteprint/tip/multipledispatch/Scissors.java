package com.googlecode.whiteprint.tip.multipledispatch;

class Scissors implements Item {
    @Override
    public Outcome compete(final Item it) {
	return it.eval(this);
    }

    @Override
    public Outcome eval(final Paper p) {
	return Outcome.LOSE;
    }

    @Override
    public Outcome eval(final Rock r) {
	return Outcome.WIN;
    }

    @Override
    public Outcome eval(final Scissors s) {
	return Outcome.DRAW;
    }

    @Override
    public String toString() {
	return "Scissors";
    }
}