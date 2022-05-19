package com.sofkau.ddd.order.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.order.values.Employee_Id;
import com.sofkau.ddd.order.values.Employee_Type;

public class Employee_TypeChanged extends DomainEvent {
    private  Employee_Id employee_id;
    private  Employee_Type employee_type;
    public Employee_TypeChanged(Employee_Id employee_id, Employee_Type employee_type) {
        super("sofka.order.employee_typechanged");
        this.employee_id=employee_id;
        this.employee_type=employee_type;
    }

    public Employee_Id getEmployee_id() {
        return employee_id;
    }

    public Employee_Type getEmployee_type() {
        return employee_type;
    }
}
