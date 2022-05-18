package com.sofkau.ddd.food_detail;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.ddd.food_detail.values.Popcorn_Id;

public class Popcorn extends Entity<Popcorn_Id> {
    public Popcorn(Popcorn_Id entityId) {
        super(entityId);
    }
}
