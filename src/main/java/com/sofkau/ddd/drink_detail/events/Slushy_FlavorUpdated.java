package com.sofkau.ddd.drink_detail.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.drink_detail.values.Slushy_Flavor;
import com.sofkau.ddd.drink_detail.values.Slushy_Id;

public class Slushy_FlavorUpdated extends DomainEvent {
    private final Slushy_Id slushy_id;
    private final Slushy_Flavor slushy_flavor;
    public Slushy_FlavorUpdated(Slushy_Id slushy_id, Slushy_Flavor slushy_flavor) {
        super("sofka.drink.slushyflavorupdated");
        this.slushy_id=slushy_id;
        this.slushy_flavor=slushy_flavor;
    }

    public Slushy_Id getSlushy_id() {
        return slushy_id;
    }

    public Slushy_Flavor getSlushy_flavor() {
        return slushy_flavor;
    }
}
