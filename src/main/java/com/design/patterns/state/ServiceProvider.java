package com.design.patterns.state;

class ServiceProvider {
    private State2 state;

    public ServiceProvider(final State2 state) {
	this.state = state;
    }

    public void changeState(final State2 newState) {
	this.state = newState;
    }

    // Pass method calls to the implementation:
    public void service1() {
	// ...
	this.state.operation1();
	// ...
	this.state.operation3();
    }

    public void service2() {
	// ...
	this.state.operation1();
	// ...
	this.state.operation2();
    }

    public void service3() {
	// ...
	this.state.operation3();
	// ...
	this.state.operation2();
    }
}