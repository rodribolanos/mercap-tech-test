package org.example.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocalCallTest {

    @Test
    void callOnSaturday_shouldDivideCostBy5() {
        LocalDateTime date = LocalDateTime.of(2024, 6, 8, 10, 0);
        int minutes = 10;
        LocalCall call = new LocalCall(date, minutes);

        assertEquals(2.0, call.getCost());
    }

    @Test
    void callOnSunday_shouldDivideCostBy5() {
        LocalDateTime date = LocalDateTime.of(2024, 6, 8, 10, 0);
        int minutes = 20;
        LocalCall call = new LocalCall(date, minutes);

        assertEquals(4.0, call.getCost());
    }

    @Test
    void callOnBusinessDayAMinuteTo8hs_shouldDivideCostBy10() {
        LocalDateTime date = LocalDateTime.of(2026, 4, 20, 7, 59);
        int minutes = 10;
        LocalCall call = new LocalCall(date, minutes);

        assertEquals(1.0, call.getCost());
    }

    @Test
    void callOnBusinessDayAt8hs_shouldDivideCostBy5() {
        LocalDateTime date = LocalDateTime.of(2026, 4, 20, 8, 0);
        int minutes = 10;
        LocalCall call = new LocalCall(date, minutes);

        assertEquals(2.0, call.getCost());
    }

    @Test
    void callOnBusinessDayAtPast8hs_shouldDivideCostBy10() {
        LocalDateTime date = LocalDateTime.of(2026, 4, 20, 20, 1);
        int minutes = 10;
        LocalCall call = new LocalCall(date, minutes);

        assertEquals(1.0, call.getCost());
    }

    @Test
    void callOnBusinessDayAMinuteTo20hs_shouldDivideCostBy5() {
        LocalDateTime date = LocalDateTime.of(2026, 4, 20, 19, 59);
        int minutes = 10;
        LocalCall call = new LocalCall(date, minutes);

        assertEquals(2.0, call.getCost());
    }

    @Test
    void callOnBusinessDayAt20hs_shouldDivideCostBy10() {
        LocalDateTime date = LocalDateTime.of(2026, 4, 20, 20, 0);
        int minutes = 10;
        LocalCall call = new LocalCall(date, minutes);

        assertEquals(1.0, call.getCost());
    }

    @Test
    void callOnBusinessDayPast20hs_shouldDivideCostBy10() {
        LocalDateTime date = LocalDateTime.of(2026, 4, 20, 20, 1);
        int minutes = 10;
        LocalCall call = new LocalCall(date, minutes);

        assertEquals(1.0, call.getCost());
    }
}
