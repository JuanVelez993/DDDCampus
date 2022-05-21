package com.sofkau.ddd.order.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.ddd.order.values.Client_Id;
import com.sofkau.ddd.order.values.Name;
import com.sofkau.ddd.order.values.Order_Id;

public class UpdateClientName extends Command {
    private final Order_Id orderId;
    private final Client_Id client_id;
    private final Name name;

    public UpdateClientName(Order_Id orderId, Client_Id client_id, Name name) {
        this.orderId = orderId;
        this.client_id = client_id;
        this.name = name;
    }

    public Order_Id getOrderId() {
        return orderId;
    }

    public Client_Id getClient_id() {
        return client_id;
    }

    public Name getName() {
        return name;
    }
}
