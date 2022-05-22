package com.sofkau.ddd.order.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.order.values.Client_Id;
import com.sofkau.ddd.generic.Name;
import com.sofkau.ddd.order.values.Payment;

public class ClientAdded extends DomainEvent {
    private Client_Id client_id;
    private Name name;
    private Payment payment;
    public ClientAdded(Client_Id entityId, Name name, Payment payment) {
        super("sofka.order.clientadded");
        this.client_id=entityId;
        this.name=name;
        this.payment=payment;
    }

    public Client_Id getClient_id() {
        return client_id;
    }

    public Name getName() {
        return name;
    }

    public Payment getPayment() {
        return payment;
    }
}
