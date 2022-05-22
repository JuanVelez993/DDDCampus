package com.sofkau.ddd.food_detail.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.food_detail.values.Popcorn_Id;
import com.sofkau.ddd.generic.Value;

public class PopcornValuedUpdated extends DomainEvent {
    private final Popcorn_Id popcorn_id;
    private final Value value;
    public PopcornValuedUpdated(Popcorn_Id popcorn_id, Value value) {
        super("sofka.food.popcornvalueupdated");
        this.popcorn_id=popcorn_id;
        this.value=value;
    }

    public Popcorn_Id getPopcorn_id() {
        return popcorn_id;
    }

    public Value getValue() {
        return value;
    }
}
