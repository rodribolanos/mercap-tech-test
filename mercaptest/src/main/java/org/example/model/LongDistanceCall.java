package org.example.model;

abstract public class LongDistanceCall extends Call {
    @Override
    public Double getCallCost() {
        return this.getTarget().getCallCost();
    }

    abstract Callable getTarget();
}
