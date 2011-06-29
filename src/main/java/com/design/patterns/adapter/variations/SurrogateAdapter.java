package com.design.patterns.adapter.variations;

class SurrogateAdapter implements WhatIWant {
    WhatIHave whatIHave;

    public SurrogateAdapter(final WhatIHave wih) {
	this.whatIHave = wih;
    }

    @Override
    public void f() {
	// Implement behavior using
	// methods in WhatIHave:
	this.whatIHave.g();
	this.whatIHave.h();
    }
}