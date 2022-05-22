package com.sofkau.ddd.drink_detail.values;

import co.com.sofka.domain.generic.ValueObject;


import java.util.Objects;

public class Drink_Value implements ValueObject<Double> {
    private final Double value;

    public Drink_Value(Double value) {
        this.value = Objects.requireNonNull(value);


    }

    @Override
    public Double value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Drink_Value)) return false;
        Drink_Value drink_value = (Drink_Value) o;
        return Objects.equals(value, drink_value.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
