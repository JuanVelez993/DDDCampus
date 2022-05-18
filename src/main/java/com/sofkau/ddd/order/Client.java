package com.sofkau.ddd.order;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.ddd.order.values.Client_Id;

public class Client extends Entity<Client_Id> {
    public Client(Client_Id entityId) {
        super(entityId);
    }
}
