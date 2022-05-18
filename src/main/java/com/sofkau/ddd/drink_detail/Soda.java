package com.sofkau.ddd.drink_detail;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.ddd.drink_detail.values.Soda_Id;

public class Soda extends Entity<Soda_Id> {

    public Soda(Soda_Id entityId) {
        super(entityId);
    }
}
