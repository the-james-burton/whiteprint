package com.design.concurrency.sharing;

import java.util.HashSet;
import java.util.Set;

class Ark {
    private final Set<AnimalPair> loadedAnimals = new HashSet<AnimalPair>();

    public void load(AnimalPair pair) {
        loadedAnimals.add(pair);
    }
}