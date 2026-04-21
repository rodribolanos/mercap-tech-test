package org.example.model;


public class City implements CallableTarget {
    public double callCost;

    public City(int callCost) {
        this.callCost = callCost;
    }

    public double getCallCost() {
        return callCost;
    }
}
