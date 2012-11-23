package com.design.concurrency.sharing;
class Animal {
    Species species;
    Gender gender;

    public boolean isPotentialMate(Animal other) {
        return species == other.species && gender != other.gender;
    }
}