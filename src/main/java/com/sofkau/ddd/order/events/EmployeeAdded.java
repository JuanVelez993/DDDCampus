package com.sofkau.ddd.order.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.order.values.Employee_Id;
import com.sofkau.ddd.order.values.Employee_Type;
import com.sofkau.ddd.generic.Name;

public class EmployeeAdded extends DomainEvent {
    private Employee_Id employee_id;
    private Employee_Type employee_type;
    private  Name name;
    public EmployeeAdded(Employee_Id entityId, Employee_Type employee_type, Name name) {
        super("sofka.order.employeeadded");
        this.employee_id=entityId;
        this.employee_type=employee_type;
        this.name=name;
    }

    public Employee_Id getEmployee_id() {
        return employee_id;
    }

    public Employee_Type getEmployee_type() {
        return employee_type;
    }

    public Name getName() {
        return name;
    }
}
