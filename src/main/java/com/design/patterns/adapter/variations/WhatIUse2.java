package com.design.patterns.adapter.variations;

class WhatIUse2 extends WhatIUse {
    public void op(final WhatIHave wih) {
	new SurrogateAdapter(wih).f();
    }
}