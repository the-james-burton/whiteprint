package com.design.patterns.adapter.variations;

class WhatIUse2 extends WhatIUse {
    public void op(WhatIHave wih) {
        new SurrogateAdapter(wih).f();
    }
}