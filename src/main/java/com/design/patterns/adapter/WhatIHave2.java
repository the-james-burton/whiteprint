package com.design.patterns.adapter;

public class WhatIHave2 extends WhatIHave implements WhatIWant {
    public void f() {
        g();
        h();
    }
}