package com.sofkau.ddd.food_detail;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.ddd.food_detail.values.Fast_Food_Id;

public class Fast_Food extends Entity<Fast_Food_Id> {

    public Fast_Food(Fast_Food_Id entityId) {
        super(entityId);
    }
}
