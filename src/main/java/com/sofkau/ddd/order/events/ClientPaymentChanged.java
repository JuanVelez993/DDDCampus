package com.sofkau.ddd.order.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.order.values.Client_Id;
import com.sofkau.ddd.order.values.Payment;

public class ClientPaymentChanged extends DomainEvent {
    private  Client_Id client_id;
    private Payment payment;
    public ClientPaymentChanged(Client_Id client_id, Payment payment) {
        super("sofka.order.clientpaymentadded");
        this.client_id=client_id;
        this.payment=payment;
    }

    public Client_Id getClient_id() {
        return client_id;
    }

    public Payment getPayment() {
        return payment;
    }
}
