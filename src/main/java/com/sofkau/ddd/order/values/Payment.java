package com.sofkau.ddd.order.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Payment implements ValueObject<Double> {
    private final Double value;

    public Payment(Double value) {
        this.value = Objects.requireNonNull(value);


    }

    @Override
    public Double value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payment)) return false;
        Payment payment = (Payment) o;
        return Objects.equals(value, payment.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
