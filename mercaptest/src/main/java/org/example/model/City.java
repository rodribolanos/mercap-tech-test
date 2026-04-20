package org.example.model;

public class City implements Callable {
    public String name;
    public double callCost;

    public City(String name) {
        this.name = name;
    }

    public double getCallCost() {
        return callCost;
    }
}
