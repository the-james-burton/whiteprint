package com.design.patterns.state;

class ServiceProvider {
    private State2 state;

    public ServiceProvider(State2 state) {
        this.state = state;
    }

    public void changeState(State2 newState) {
        state = newState;
    }

    // Pass method calls to the implementation:
    public void service1() {
        // ...
        state.operation1();
        // ...
        state.operation3();
    }

    public void service2() {
        // ...
        state.operation1();
        // ...
        state.operation2();
    }

    public void service3() {
        // ...
        state.operation3();
        // ...
        state.operation2();
    }
}