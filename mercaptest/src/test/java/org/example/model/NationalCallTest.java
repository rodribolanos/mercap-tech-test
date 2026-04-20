package org.example.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NationalCallTest {

    @Test
    void callToA30CostCity_shouldReturnCityCost() {
        City city30Cost = new City(30);
        Call call = new NationalCall(LocalDateTime.of(2026, 4, 20, 20, 12), city30Cost);

        assertEquals(30, call.getCallCost());
    }
}
