package org.example.model;

import java.util.List;

public class Bill {
    private double monthlyPayment;
    List<Call> calls;

    public Bill(double monthlyPayment, List<Call> calls) {
        this.monthlyPayment = monthlyPayment;
        this.calls = calls;
    }
}
