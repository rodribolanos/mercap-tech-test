package org.example;

import org.example.model.*;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        Call localCallCost10 = new LocalCall(LocalDateTime.of(2026, 4, 21, 20, 20),  100);
        Call localCallCost20 = new LocalCall(LocalDateTime.of(2026, 4, 21, 20, 20),  200);
        Call localCallBussinesCost40 = new LocalCall(LocalDateTime.of(2026, 4, 21, 18, 20),  200);
        Call nationalCallCost20 = new NationalCall(LocalDateTime.of(2026, 4, 21, 20, 20), new City(20));
        Call internationalCallCost30 = new InternationalCall(LocalDateTime.of(2026, 4, 21, 20, 20), new Country(30));

        Bill bill = new Bill(200);
        bill.addCall(localCallCost10);
        bill.addCall(localCallCost20);
        bill.addCall(localCallBussinesCost40);
        bill.addCall(nationalCallCost20);
        bill.addCall(internationalCallCost30);

        System.out.print(bill.toString());
    }
}