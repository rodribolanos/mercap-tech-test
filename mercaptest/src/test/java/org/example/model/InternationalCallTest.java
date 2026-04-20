package org.example.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InternationalCallTest {

    @Test
    void callToA20CostCountry_shouldReturnCountryCost() {
        Country country10Cost = new Country(10);
        Call call = new InternationalCall(LocalDateTime.of(2026, 4, 20, 20, 18), country10Cost);

        assertEquals(10, call.getCallCost());
    }

}
