package com.design.patterns.proxy;

class Implementation implements ProxyBase {
    @Override
    public void f() {
	System.out.println("Implementation.f()");
    }

    @Override
    public void g() {
	System.out.println("Implementation.g()");
    }

    @Override
    public void h() {
	System.out.println("Implementation.h()");
    }
}