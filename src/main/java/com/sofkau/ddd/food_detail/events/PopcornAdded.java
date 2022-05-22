package com.sofkau.ddd.food_detail.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.food_detail.values.Popcorn_Id;
import com.sofkau.ddd.food_detail.values.Popcorn_Type;
import com.sofkau.ddd.generic.Value;

public class PopcornAdded extends DomainEvent {
    private final Popcorn_Id entityId;
    private final Popcorn_Type popcorn_type;
    private final Value value;
    public PopcornAdded(Popcorn_Id entityId,Popcorn_Type popcorn_type,Value value) {
        super("sofka.food.popcornadded");
        this.entityId=entityId;
        this.popcorn_type=popcorn_type;
        this.value=value;
    }

    public Popcorn_Id getEntityId() {
        return entityId;
    }

    public Popcorn_Type getPopcorn_type() {
        return popcorn_type;
    }

    public Value getValue() {
        return value;
    }
}
