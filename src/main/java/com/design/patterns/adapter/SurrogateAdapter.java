package com.design.patterns.adapter;

class SurrogateAdapter implements WhatIWant {
    WhatIHave whatIHave;

    public SurrogateAdapter(WhatIHave wih) {
        whatIHave = wih;
    }

    public void f() {
        // Implement behavior using
        // methods in WhatIHave:
        whatIHave.g();
        whatIHave.h();
    }
}