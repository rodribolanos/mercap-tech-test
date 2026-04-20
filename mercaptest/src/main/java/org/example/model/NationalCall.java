package org.example.model;

import java.time.LocalDateTime;

public class NationalCall extends LongDistanceCall {
    private final City city;

    public NationalCall(LocalDateTime date, City city) {
        setDate(date);
        this.city = city;
    }

    @Override
    Callable getTarget() {
        return this.city;
    }
}
