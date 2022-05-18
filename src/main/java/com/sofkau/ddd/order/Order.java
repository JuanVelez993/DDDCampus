package com.sofkau.ddd.order;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkau.ddd.order.values.Order_Id;

public class Order extends AggregateEvent<Order_Id> {

    public Order(Order_Id entityId) {
        super(entityId);
    }
}
