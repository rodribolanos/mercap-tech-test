package org.example.model;

import java.time.LocalDateTime;

abstract public class Call {
    private LocalDateTime date;

    protected LocalDateTime getDate() {
        return date;
    }

    protected void setDate(LocalDateTime date) {
        this.date = date;
    }

    abstract public Double getCost();
    abstract public CallType getCallType();
}
