package com.googlecode.whiteprint.tip.bridge;

class ClientService1 extends Abstraction {
    public ClientService1(final Implementation imp) {
	super(imp);
    }

    public void serviceA() {
	service1();
	service2();
    }

    public void serviceB() {
	service3();
    }
}