package com.sofkau.ddd.order.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.ddd.order.values.Employee_Id;
import com.sofkau.ddd.order.values.Name;
import com.sofkau.ddd.order.values.Order_Id;

public class UpdateEmployeeName extends Command {
    private final Order_Id orderId;
    private final Employee_Id employee_id;
    private final Name name;

    public UpdateEmployeeName(Order_Id orderId, Employee_Id employee_id, Name name) {
        this.orderId = orderId;
        this.employee_id = employee_id;
        this.name = name;
    }

    public Order_Id getOrderId() {
        return orderId;
    }

    public Employee_Id getEmployee_id() {
        return employee_id;
    }

    public Name getName() {
        return name;
    }
}
