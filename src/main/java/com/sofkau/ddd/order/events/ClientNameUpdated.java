package com.sofkau.ddd.order.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.order.values.Client_Id;
import com.sofkau.ddd.generic.Name;

public class ClientNameUpdated extends DomainEvent {
    private Client_Id client_id;
    private Name name;
    public ClientNameUpdated(Client_Id client_id, Name name) {
        super("sofka.order.clientnameupdated");
        this.client_id=client_id;
        this.name=name;
    }

    public Client_Id getClient_id() {
        return client_id;
    }

    public Name getName() {
        return name;
    }
}
