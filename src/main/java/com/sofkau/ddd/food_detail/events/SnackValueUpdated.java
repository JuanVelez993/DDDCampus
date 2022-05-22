package com.sofkau.ddd.food_detail.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.food_detail.values.Snack_Id;
import com.sofkau.ddd.food_detail.values.Value;

public class SnackValueUpdated extends DomainEvent {
    private final Snack_Id snack_id;
    private final Value value;
    public SnackValueUpdated(Snack_Id snack_id, Value value) {
        super("sofka.food.snackvalueupdated");
        this.snack_id=snack_id;
        this.value=value;
    }

    public Snack_Id getSnack_id() {
        return snack_id;
    }

    public Value getValue() {
        return value;
    }
}
