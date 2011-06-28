package com.design.patterns.adapter;

public class WhatIHave3 extends WhatIHave {
    private class InnerAdapter implements WhatIWant {
        public void f() {
            g();
            h();
        }
    }

    public WhatIWant whatIWant() {
        return new InnerAdapter();
    }
}