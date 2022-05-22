package com.sofkau.ddd.food_detail.values;

import co.com.sofka.domain.generic.ValueObject;
import com.sofkau.ddd.food_detail.values.Fast_Food_Type;

import java.util.Objects;

public class Fast_Food_Type implements ValueObject<String> {
    private final String value;

    public Fast_Food_Type(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()) {
            throw new IllegalArgumentException("The fast food type  can't be blank");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fast_Food_Type)) return false;
        Fast_Food_Type fast_food_type = (Fast_Food_Type) o;
        return Objects.equals(value, fast_food_type.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
