package com.sofkau.ddd.drink_detail.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.drink_detail.values.Slushy_Flavor;
import com.sofkau.ddd.drink_detail.values.Slushy_Id;
import com.sofkau.ddd.generic.Value;

public class SlushyAdded extends DomainEvent {
    private final Slushy_Id slushy_id;
    private final Slushy_Flavor slushy_flavor;
    private final Value value;
    public SlushyAdded(Slushy_Id slushy_id, Slushy_Flavor slushy_flavor, Value value) {
        super("sofka.drink.slushyadded");
        this.slushy_id=slushy_id;
        this.slushy_flavor=slushy_flavor;
        this.value=value;
    }

    public Slushy_Id getSlushy_id() {
        return slushy_id;
    }

    public Slushy_Flavor getSlushy_flavor() {
        return slushy_flavor;
    }

    public Value getValue() {
        return value;
    }
}
