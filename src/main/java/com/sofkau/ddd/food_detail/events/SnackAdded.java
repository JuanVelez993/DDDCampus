package com.sofkau.ddd.food_detail.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.food_detail.values.Snack_Id;
import com.sofkau.ddd.food_detail.values.Snack_Name;
import com.sofkau.ddd.food_detail.values.Value;

public class SnackAdded extends DomainEvent {
    private final Snack_Id entityId;
    private final Snack_Name snack_name;
    private final Value value;
    public SnackAdded(Snack_Id entityId, Snack_Name snack_name, Value value) {
        super("sofka.food.snackadded");
        this.entityId=entityId;
        this.snack_name=snack_name;
        this.value=value;
    }

    public Snack_Id getEntityId() {
        return entityId;
    }

    public Snack_Name getSnack_name() {
        return snack_name;
    }

    public Value getValue() {
        return value;
    }
}
