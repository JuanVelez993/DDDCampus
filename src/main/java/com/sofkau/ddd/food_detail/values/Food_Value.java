package com.sofkau.ddd.food_detail.values;

import co.com.sofka.domain.generic.ValueObject;
import com.sofkau.ddd.food_detail.values.Food_Value;

import java.util.Objects;

public class Food_Value implements ValueObject<Double> {
    private final Double value;

    public Food_Value(Double value) {
        this.value = Objects.requireNonNull(value);


    }

    @Override
    public Double value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Food_Value)) return false;
        Food_Value food_value = (Food_Value) o;
        return Objects.equals(value, food_value.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
