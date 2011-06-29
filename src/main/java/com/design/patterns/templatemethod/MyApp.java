package com.design.patterns.templatemethod;

class MyApp extends ApplicationFramework {
    @Override
    void customize1() {
	System.out.print("Hello ");
    }

    @Override
    void customize2() {
	System.out.println("World!");
    }
}