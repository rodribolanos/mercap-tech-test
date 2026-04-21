package org.example.model;

import java.time.LocalDateTime;

abstract public class LongDistanceCall extends Call {
    public LongDistanceCall(LocalDateTime date) {
        super(date);
    }

    @Override
    public Double getCost() {
        return this.getTarget().getCallCost();
    }

    @Override
    public CallType getCallType() {
        return CallType.LONG_DISTANCE;
    }

    abstract CallableTarget getTarget();
}
