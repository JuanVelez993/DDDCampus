package com.sofkau.ddd.drink_detail.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.drink_detail.values.Soda_Id;
import com.sofkau.ddd.drink_detail.values.Soda_Type;

public class Soda_typeChanged extends DomainEvent {
    private final Soda_Id entityId;
    private final Soda_Type soda_type;
    public Soda_typeChanged(Soda_Id entityId, Soda_Type soda_type) {
        super("sofka.drink.sodatypechanged");
        this.entityId=entityId;
        this.soda_type=soda_type;
    }

    public Soda_Id getEntityId() {
        return entityId;
    }

    public Soda_Type getSoda_type() {
        return soda_type;
    }
}
