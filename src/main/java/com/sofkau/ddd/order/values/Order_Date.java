package com.sofkau.ddd.order.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Order_Date implements ValueObject<String> {
    private final String value;

    public Order_Date(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()) {
            throw new IllegalArgumentException("The order date can't be blank");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order_Date)) return false;
        Order_Date order_date = (Order_Date) o;
        return Objects.equals(value, order_date.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
