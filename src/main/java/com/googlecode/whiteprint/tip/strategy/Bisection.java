package com.googlecode.whiteprint.tip.strategy;

import java.util.ArrayList;
import java.util.List;

class Bisection implements FindMinima {
    @Override
    public List<Double> algorithm(List<Double> line) {
	List<Double> results = new ArrayList<Double>();
	results.add(5.5);
	results.add(6.6);
	return results; // dummy data
    }
}