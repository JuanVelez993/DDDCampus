package com.sofkau.ddd.order.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Employee_Type implements ValueObject<String> {
    private final String value;

    public Employee_Type(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()) {
            throw new IllegalArgumentException("The employee type  can't be blank");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee_Type)) return false;
        Employee_Type employee_type = (Employee_Type) o;
        return Objects.equals(value, employee_type.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
