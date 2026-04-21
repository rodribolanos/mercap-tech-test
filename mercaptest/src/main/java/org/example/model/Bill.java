package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Bill {
    private double monthlyPayment;
    private final List<Call> calls;

    public Bill(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
        this.calls = new ArrayList<>();
    }

    public void addCall(Call call) {
        calls.add(call);
    }

    public double calculateTotalBillI() {
        return monthlyPayment + calculateTotalLocalCallCost()  + calculateTotalLongDistanceCallCost();
    }

    private double calculateTotalLocalCallCost() {
        return calls.stream()
                .filter(call ->call.getCallType().equals(CallType.LOCAL))
                .mapToDouble(Call::getCost)
                .sum();
    }

    private double calculateTotalLongDistanceCallCost() {
        return calls.stream()
                .filter(call -> call.getCallType().equals(CallType.LONG_DISTANCE) )
                .mapToDouble(Call::getCost)
                .sum();
    }

    @Override
    public String toString() {
        return "Bill: \n" +
                "Local calls cost: " + calculateTotalLocalCallCost() + ". \n" +
                "National and International calls cost: " + calculateTotalLongDistanceCallCost() + ". \n" +
                "Monthly payment: " + this.monthlyPayment + "\n";
    }
}
