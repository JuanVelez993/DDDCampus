package com.sofkau.ddd.drink_detail.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.drink_detail.values.Soda_Id;
import com.sofkau.ddd.drink_detail.values.Value;

public class SodaValueUpdated extends DomainEvent {
    private final Soda_Id entityId;
    private final Value value;
    public SodaValueUpdated(Soda_Id entityId, Value value) {
        super("sofka.drink.sodavalueupdtaed");
        this.entityId=entityId;
        this.value=value;
    }

    public Soda_Id getEntityId() {
        return entityId;
    }

    public Value getValue() {
        return value;
    }
}
