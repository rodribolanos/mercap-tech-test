package org.example.model;


public class Country implements CallableTarget {
    public double callCost;

    public Country(int callCost) {
        this.callCost = callCost;
    }

    public double getCallCost() {
        return callCost;
    }
}
