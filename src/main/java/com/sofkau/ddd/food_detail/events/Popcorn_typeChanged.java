package com.sofkau.ddd.food_detail.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.food_detail.values.Popcorn_Id;
import com.sofkau.ddd.food_detail.values.Popcorn_Type;

public class Popcorn_typeChanged extends DomainEvent {
    private final Popcorn_Id entityId;
    private final Popcorn_Type popcorn_type;
    public Popcorn_typeChanged(Popcorn_Id entityId, Popcorn_Type popcorn_type) {

        super("sofka.food.popcorntypechanged");
        this.entityId=entityId;
        this.popcorn_type=popcorn_type;
    }
}
