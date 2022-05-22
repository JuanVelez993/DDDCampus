package com.sofkau.ddd.order.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.ddd.order.values.Employee_Id;
import com.sofkau.ddd.order.values.Employee_Type;
import com.sofkau.ddd.generic.Name;
import com.sofkau.ddd.order.values.Order_Id;

public class AddEmployee extends Command {
    private final Order_Id orderId;
    private final Employee_Id entityId;
    private final Employee_Type employee_type;
    private final Name name;

    public AddEmployee(Order_Id orderId, Employee_Id entityId, Employee_Type employee_type, Name name) {
        this.orderId = orderId;
        this.entityId = entityId;
        this.employee_type = employee_type;
        this.name = name;
    }

    public Order_Id getOrderId() {
        return orderId;
    }

    public Employee_Id getEntityId() {
        return entityId;
    }

    public Employee_Type getEmployee_type() {
        return employee_type;
    }

    public Name getName() {
        return name;
    }
}
