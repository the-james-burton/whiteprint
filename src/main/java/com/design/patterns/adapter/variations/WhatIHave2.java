package com.design.patterns.adapter.variations;

class WhatIHave2 extends WhatIHave implements WhatIWant {
    @Override
    public void f() {
	g();
	h();
    }
}