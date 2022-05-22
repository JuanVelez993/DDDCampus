package com.sofkau.ddd.generic;

import co.com.sofka.domain.generic.ValueObject;


import java.util.Objects;

public class Value implements ValueObject<Double> {
    private final Double value;

    public Value(Double value) {
        this.value = Objects.requireNonNull(value);


    }

    @Override
    public Double value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Value)) return false;
        Value valuef = (Value) o;
        return Objects.equals(value, valuef.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
