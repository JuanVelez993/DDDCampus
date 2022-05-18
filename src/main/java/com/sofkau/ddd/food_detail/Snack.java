package com.sofkau.ddd.food_detail;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.ddd.food_detail.values.Snack_Id;

public class Snack extends Entity<Snack_Id> {
    public Snack(Snack_Id entityId) {
        super(entityId);
    }
}
