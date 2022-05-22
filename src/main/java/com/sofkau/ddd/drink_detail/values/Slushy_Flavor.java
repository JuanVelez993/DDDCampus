package com.sofkau.ddd.drink_detail.values;

import co.com.sofka.domain.generic.ValueObject;
import com.sofkau.ddd.drink_detail.values.Slushy_Flavor;

import java.util.Objects;

public class Slushy_Flavor implements ValueObject<String> {
    private final String value;

    public Slushy_Flavor(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()) {
            throw new IllegalArgumentException("The slushy flavor can't be blank");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Slushy_Flavor)) return false;
        Slushy_Flavor slushy_flavor = (Slushy_Flavor) o;
        return Objects.equals(value, slushy_flavor.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
