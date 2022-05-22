package com.sofkau.ddd.order.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.order.values.Employee_Id;
import com.sofkau.ddd.generic.Name;

public class EmployeeNameUpdated extends DomainEvent {
    private Employee_Id employee_id;
    private Name name;
    public EmployeeNameUpdated(Employee_Id employee_id, Name name) {
        super("sofka.order.employeenameupdated");
        this.employee_id=employee_id;
        this.name=name;
    }

    public Employee_Id getEmployee_id() {
        return employee_id;
    }

    public Name getName() {
        return name;
    }
}
