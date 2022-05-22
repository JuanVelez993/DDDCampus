package com.sofkau.ddd.drink_detail.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.drink_detail.values.Soda_Id;
import com.sofkau.ddd.drink_detail.values.Soda_Type;
import com.sofkau.ddd.drink_detail.values.Value;

public class SodaAdded extends DomainEvent {
    private final Soda_Id entityId;
    private final Soda_Type soda_type;
    private final Value value;
    public SodaAdded(Soda_Id entityId, Soda_Type soda_type, Value value) {
        super("sofka.drink.sodaadded");
        this.entityId=entityId;
        this.soda_type=soda_type;
        this.value=value;
    }

    public Soda_Id getEntityId() {
        return entityId;
    }

    public Soda_Type getSoda_type() {
        return soda_type;
    }

    public Value getValue() {
        return value;
    }
}
