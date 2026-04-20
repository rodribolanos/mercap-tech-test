package org.example.model;

public class Country implements Callable {
    public City city;
    public double callCost;

    public Country(City city) {
        this.city = city;
    }

    public City getCity() {
        return city;
    }

    public double getCallCost() {
        return callCost;
    }
}
