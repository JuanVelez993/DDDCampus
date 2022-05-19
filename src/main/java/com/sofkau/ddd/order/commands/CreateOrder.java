package com.sofkau.ddd.order.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.ddd.order.values.Order_Date;
import com.sofkau.ddd.order.values.Order_Id;

public class CreateOrder extends Command {
    private final Order_Id orderId;
    private final Order_Date order_date;

    public CreateOrder(Order_Id orderId, Order_Date order_date) {
        this.orderId = orderId;
        this.order_date = order_date;
    }

    public Order_Id getOrderId() {
        return orderId;
    }

    public Order_Date getOrder_date() {
        return order_date;
    }
}
