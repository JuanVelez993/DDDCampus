package com.sofkau.ddd.drink_detail.values;

import co.com.sofka.domain.generic.ValueObject;


import java.util.Objects;

public class Soda_Type implements ValueObject<String> {
    private final String value;

    public Soda_Type(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()) {
            throw new IllegalArgumentException("The soda type  can't be blank");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Soda_Type)) return false;
        Soda_Type soda_type = (Soda_Type) o;
        return Objects.equals(value, soda_type.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
