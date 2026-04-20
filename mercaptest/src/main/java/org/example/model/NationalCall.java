package org.example.model;

public class NationalCall extends LongDistanceCall {
    private final City city;

    public NationalCall(City city) {
        this.city = city;
    }

    @Override
    Callable getTarget() {
        return this.city;
    }
}
