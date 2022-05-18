package com.sofkau.ddd.order;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.ddd.order.values.Employee_Id;

public class Employee extends Entity<Employee_Id> {

    public Employee(Employee_Id entityId) {
        super(entityId);
    }
}
