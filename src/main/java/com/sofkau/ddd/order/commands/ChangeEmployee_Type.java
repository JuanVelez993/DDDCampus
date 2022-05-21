package com.sofkau.ddd.order.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.ddd.order.values.Employee_Id;
import com.sofkau.ddd.order.values.Employee_Type;
import com.sofkau.ddd.order.values.Order_Id;

public class ChangeEmployee_Type extends Command {
    private final Order_Id orderId;
    private final Employee_Id employee_id;
    private final Employee_Type employee_type;

    public ChangeEmployee_Type(Order_Id orderId, Employee_Id employee_id, Employee_Type employee_type) {
        this.orderId = orderId;
        this.employee_id = employee_id;
        this.employee_type = employee_type;
    }

    public Order_Id getOrderId() {
        return orderId;
    }

    public Employee_Id getEmployee_id() {
        return employee_id;
    }

    public Employee_Type getEmployee_type() {
        return employee_type;
    }
}
