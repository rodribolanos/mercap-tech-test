package org.example.model;

import org.junit.jupiter.api.BeforeAll;

public class InternationalCall {
    private Country country20Cost;
    private Country country10Cost;

    @BeforeAll
    public void setUp() {
        country20Cost = new Country(20);
        country10Cost = new Country(10);
    }
}
