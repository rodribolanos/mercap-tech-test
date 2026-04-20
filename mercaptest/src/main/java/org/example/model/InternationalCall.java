package org.example.model;

public class InternationalCall extends LongDistanceCall {
    private final Country country;

    public InternationalCall(Country country) {
        this.country = country;
    }

    @Override
    Callable getTarget() {
        return country;
    }
}
