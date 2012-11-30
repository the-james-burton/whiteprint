package com.googlecode.whiteprint.tip.multipledispatch;

class Rock implements Item {
    @Override
    public Outcome compete(final Item it) {
	return it.eval(this);
    }

    @Override
    public Outcome eval(final Paper p) {
	return Outcome.WIN;
    }

    @Override
    public Outcome eval(final Rock r) {
	return Outcome.DRAW;
    }

    @Override
    public Outcome eval(final Scissors s) {
	return Outcome.LOSE;
    }

    @Override
    public String toString() {
	return "Rock";
    }
}