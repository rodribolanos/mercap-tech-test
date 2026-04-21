package org.example.model;

abstract public class LongDistanceCall extends Call {
    @Override
    public Double getCallCost() {
        return this.getTarget().getCallCost();
    }

    @Override
    public CallType getCallType() {
        return CallType.LONG_DISTANCE;
    }

    abstract Callable getTarget();
}
