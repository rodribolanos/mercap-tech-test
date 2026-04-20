package org.example.model;

import java.time.LocalDateTime;

public class InternationalCall extends LongDistanceCall {
    private final Country country;

    public InternationalCall(LocalDateTime date, Country country) {
        setDate(date);
        this.country = country;
    }

    @Override
    Callable getTarget() {
        return country;
    }
}
