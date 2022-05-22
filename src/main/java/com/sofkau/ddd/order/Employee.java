package com.sofkau.ddd.order;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.ddd.order.values.Employee_Id;
import com.sofkau.ddd.order.values.Employee_Type;
import com.sofkau.ddd.generic.Name;

import java.util.Objects;

public class Employee extends Entity<Employee_Id> {
    protected Employee_Type employee_type;
    protected Name name;

    public Employee(Employee_Id entityId,Employee_Type employee_type,Name name) {
        super(entityId);
        this.employee_type=employee_type;
        this.name=name;

    }

    public void changeEmployee_Type(Employee_Type employee_type){
        this.employee_type= Objects.requireNonNull(employee_type);
    }

    public void updateName(Name name){
        this.name= Objects.requireNonNull(name);
    }

    public Employee_Type Employee_type() {
        return employee_type;
    }

    public Name Name() {
        return name;
    }
}
