package com.design.patterns.templatemethod;

abstract class ApplicationFramework {
    public ApplicationFramework() {
        templateMethod(); // Dangerous!
    }

    abstract void customize1();

    abstract void customize2();

    final void templateMethod() {
        for (int i = 0; i < 5; i++) {
            customize1();
            customize2();
        }
    }
}