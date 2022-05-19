package com.sofkau.ddd.order;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.ddd.order.values.Client_Id;
import com.sofkau.ddd.order.values.Name;
import com.sofkau.ddd.order.values.Payment;

import java.util.Objects;

public class Client extends Entity<Client_Id> {
    protected Name name;
    protected Payment payment;

    public Client(Client_Id entityId,Name name,Payment payment) {
        super(entityId);
        this.name=name;
        this.payment=payment;
    }

    public void updateName(Name name){
        this.name= Objects.requireNonNull(name);
    }

    public void changePayment(Payment payment){
        this.payment= Objects.requireNonNull(payment);
    }
    public Name Name() {
        return name;
    }

    public Payment Payment() {
        return payment;
    }
}
