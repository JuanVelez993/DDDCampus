package com.sofkau.ddd.food_detail.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.food_detail.values.Fast_Food_Id;
import com.sofkau.ddd.generic.Value;

public class Fast_Food_ValueUpdated extends DomainEvent {
    private final Fast_Food_Id fast_food_id;
    private final Value value;
    public Fast_Food_ValueUpdated(Fast_Food_Id fast_food_id, Value value) {
        super("sofka.food.fastfood.updated");
        this.fast_food_id=fast_food_id;
        this.value=value;
    }

    public Fast_Food_Id getFast_food_id() {
        return fast_food_id;
    }

    public Value getValue() {
        return value;
    }
}
