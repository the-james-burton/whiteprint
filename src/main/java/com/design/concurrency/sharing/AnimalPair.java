package com.design.concurrency.sharing;

class AnimalPair {
    private final Animal one, two;

    public AnimalPair(Animal one, Animal two) {
        this.one = one;
        this.two = two;
    }
}