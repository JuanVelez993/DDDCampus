package com.sofkau.ddd.order.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.ddd.order.values.Client_Id;
import com.sofkau.ddd.order.values.Order_Id;
import com.sofkau.ddd.order.values.Payment;

public class ChangeClientPayment extends Command {
    private final Order_Id orderId;
    private final Client_Id client_id;
    private final Payment payment;

    public ChangeClientPayment(Order_Id orderId, Client_Id client_id, Payment payment) {
        this.orderId = orderId;
        this.client_id = client_id;
        this.payment = payment;
    }

    public Order_Id getOrderId() {
        return orderId;
    }

    public Client_Id getClient_id() {
        return client_id;
    }

    public Payment getPayment() {
        return payment;
    }
}
