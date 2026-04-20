package org.example.model;


public class Country implements Callable {
    public double callCost;

    public Country(int callCost) {
        this.callCost = callCost;
    }

    public double getCallCost() {
        return callCost;
    }
}
