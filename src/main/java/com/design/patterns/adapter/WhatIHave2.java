package com.design.patterns.adapter;

class WhatIHave2 extends WhatIHave implements WhatIWant {
    public void f() {
        g();
        h();
    }
}