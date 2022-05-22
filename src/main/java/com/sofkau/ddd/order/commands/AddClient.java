package com.sofkau.ddd.order.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.ddd.order.values.Client_Id;
import com.sofkau.ddd.generic.Name;
import com.sofkau.ddd.order.values.Order_Id;
import com.sofkau.ddd.order.values.Payment;

public class AddClient extends Command {
    private final Order_Id orderId;
    private final Client_Id entityId;
    private final Name name;
    private final Payment payment;

    public AddClient(Order_Id orderId, Client_Id entityId, Name name, Payment payment) {
        this.orderId = orderId;
        this.entityId = entityId;
        this.name = name;
        this.payment = payment;
    }

    public Client_Id getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }

    public Payment getPayment() {
        return payment;
    }
}
