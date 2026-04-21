package org.example.model;

import java.time.LocalDateTime;

public class LocalCall extends Call {
    private int minutes;

    public LocalCall(LocalDateTime date, int minutes) {
        setDate(date);
        this.minutes = minutes;
    }

    @Override
    public Double getCallCost() {
        return this.minutes * this.getCostPerMinute();
    }

    @Override
    public CallType getCallType() {
        return CallType.LOCAL;
    }

    private double getCostPerMinute() {
        if (!isBussinesDay()) {
            return 0.20;
        } else {
            return getCostByTime();
        }
    }

    private boolean isBussinesDay() {
        // 6 y 7 son Sabado y Domingo
        return getDate().getDayOfWeek().getValue() <= 5;
    }

    private double getCostByTime() {
        // intervalo cerrado en 8 para tomar 8:00, intervalo abierto en 20 para tomar hasta 19:59
        return getDate().getHour() >= 8 && getDate().getHour() < 20 ? 0.20 : 0.10;
    }
}
