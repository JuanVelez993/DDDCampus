package com.sofkau.ddd.food_detail.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.food_detail.values.Snack_Id;
import com.sofkau.ddd.food_detail.values.Snack_Name;

public class Snack_nameChanged extends DomainEvent {
    private final Snack_Id snack_id;
    private final Snack_Name snack_name;

    public Snack_nameChanged(Snack_Id snack_id, Snack_Name snack_name) {
        super("sofka.food.snacknameupdated");
        this.snack_id=snack_id;
        this.snack_name=snack_name;
    }

    public Snack_Id getSnack_id() {
        return snack_id;
    }

    public Snack_Name getSnack_name() {
        return snack_name;
    }
}
