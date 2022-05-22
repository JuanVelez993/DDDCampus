package com.sofkau.ddd.food_detail.values;

import co.com.sofka.domain.generic.ValueObject;
import com.sofkau.ddd.food_detail.values.Popcorn_Type;

import java.util.Objects;

public class Popcorn_Type implements ValueObject<String> {
    private final String value;

    public Popcorn_Type(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()) {
            throw new IllegalArgumentException("The popcorn type  can't be blank");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Popcorn_Type)) return false;
        Popcorn_Type popcorn = (Popcorn_Type) o;
        return Objects.equals(value, popcorn.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
