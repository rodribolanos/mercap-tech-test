package org.example.model;


public class City implements Callable {
    public double callCost;

    public City(int callCost) {
        this.callCost = callCost;
    }

    public double getCallCost() {
        return callCost;
    }
}
