package com.sofkau.ddd.drink_detail.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.drink_detail.values.Slushy_Id;
import com.sofkau.ddd.drink_detail.values.Value;

public class SlushyValueUpdated extends DomainEvent {
    private final Slushy_Id slushy_id;
    private final Value value;
    public SlushyValueUpdated(Slushy_Id slushy_id, Value value) {
        super("sofka.value.slushyvalueupdated");
        this.slushy_id=slushy_id;
        this.value=value;
    }

    public Slushy_Id getSlushy_id() {
        return slushy_id;
    }

    public Value getValue() {
        return value;
    }
}
