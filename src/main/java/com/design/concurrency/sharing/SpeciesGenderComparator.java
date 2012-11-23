package com.design.concurrency.sharing;

import java.util.Comparator;

class SpeciesGenderComparator implements Comparator<Animal> {
    public int compare(Animal one, Animal two) {
        int speciesCompare = one.species.compareTo(two.species);
        return (speciesCompare != 0)
                ? speciesCompare
                : one.gender.compareTo(two.gender);
    }
}
