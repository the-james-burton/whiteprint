package com.design.concurrency.sharing;

import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Animals
 * <p/>
 * Thread confinement of local primitive and reference variables
 *
 * @author Brian Goetz and Tim Peierls
 */
public class Animals {
    Ark ark;
    Species species;
    Gender gender;

    public int loadTheArk(Collection<Animal> candidates) {
        SortedSet<Animal> animals;
        int numPairs = 0;
        Animal candidate = null;

        // animals confined to method, don't let them escape!
        animals = new TreeSet<Animal>(new SpeciesGenderComparator());
        animals.addAll(candidates);
        for (Animal a : animals) {
            if (candidate == null || !candidate.isPotentialMate(a))
                candidate = a;
            else {
                ark.load(new AnimalPair(candidate, a));
                ++numPairs;
                candidate = null;
            }
        }
        return numPairs;
    }










}


