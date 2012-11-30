package com.googlecode.whiteprint.tip.multipledispatch;

class Paper implements Item {
    @Override
    public Outcome compete(final Item it) {
	return it.eval(this);
    }

    @Override
    public Outcome eval(final Paper p) {
	return Outcome.DRAW;
    }

    @Override
    public Outcome eval(final Rock r) {
	return Outcome.LOSE;
    }

    @Override
    public Outcome eval(final Scissors s) {
	return Outcome.WIN;
    }

    @Override
    public String toString() {
	return "Paper";
    }
}