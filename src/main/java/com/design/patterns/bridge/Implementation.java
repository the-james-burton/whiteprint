package com.design.patterns.bridge;

interface Implementation {
    // The common implementation provided by the
    // back-end objects, each in their own way.
    void facility1();

    void facility2();

    void facility3();

    void facility4();
}