package org.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BillTest {
    private Call nationalCallCost20;
    private Call localCallCost10;
    private Call localCallCost20;
    private Call internationalCallCost30;
    private Bill bill;

    @BeforeEach
    void setUp() {
        localCallCost10 = new LocalCall(LocalDateTime.of(2026, 4, 21, 20, 20),  100);
        localCallCost20 = new LocalCall(LocalDateTime.of(2026, 4, 21, 20, 20),  200);
        nationalCallCost20 = new NationalCall(LocalDateTime.of(2026, 4, 21, 20, 20), new City(20));
        internationalCallCost30 = new InternationalCall(LocalDateTime.of(2026, 4, 21, 20, 20), new Country(30));
    }
    @Test
    void calculateBillAmmount_shouldReturnOnlyMonthlyPayment_whenThereAreNoCalls() {
        bill = new Bill(200);

        assertEquals(200, bill.calculateTotalBillI());
    }

    @Test
    void calculateBillAmmount_shouldReturnMonthlyPaymentPlusLocalCallCost_whenThereAreOnlyLocalCalls() {

        bill = new Bill(200);
        bill.addCall(localCallCost10);
        bill.addCall(localCallCost20);
        assertEquals(230, bill.calculateTotalBillI());
    }

    @Test
    void calculateBillAmmount_shouldReturnMonthlyPaymentPlusNationalCallCost_whenThereAreOnlyNationalCalls() {

        bill = new Bill(200);
        bill.addCall(nationalCallCost20);
        assertEquals(220, bill.calculateTotalBillI());
    }

    @Test
    void calculateBillAmmount_shouldReturnMonthlyPaymentPlusInternationalCallCost_whenThereAreOnlyInternationalCalls() {

        bill = new Bill(200);
        bill.addCall(internationalCallCost30);
        assertEquals(230, bill.calculateTotalBillI());
    }

    @Test
    void calculateBillAmmount_shouldReturnMonthlyPaymentPlusAllCallsCost_whenThereAreAllTypesOfCalls() {

        bill = new Bill(200);
        bill.addCall(localCallCost10);
        bill.addCall(localCallCost20);
        bill.addCall(nationalCallCost20);
        bill.addCall(internationalCallCost30);
        assertEquals(280, bill.calculateTotalBillI());
     }
}
