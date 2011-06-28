package com.design.patterns.adapter;

public class WhatIUse2 extends WhatIUse {
    public void op(WhatIHave wih) {
        new SurrogateAdapter(wih).f();
    }
}