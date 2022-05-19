package com.sofkau.ddd.order.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.order.values.Order_Date;


public class OrderCreated extends DomainEvent {
    private final Order_Date order_date;

    public OrderCreated(Order_Date order_date) {
        super("sofka.order.ordercreated");
        this.order_date=order_date;
    }

    public Order_Date getOrder_date() {
        return order_date;
    }
}
