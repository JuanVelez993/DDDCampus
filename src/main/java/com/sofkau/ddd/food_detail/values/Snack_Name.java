package com.sofkau.ddd.food_detail.values;

import co.com.sofka.domain.generic.ValueObject;


import java.util.Objects;

public class Snack_Name implements ValueObject<String> {
    private final String value;

    public Snack_Name(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()) {
            throw new IllegalArgumentException("The snack name can't be blank");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Snack_Name)) return false;
        Snack_Name snack_name = (Snack_Name) o;
        return Objects.equals(value, snack_name.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
