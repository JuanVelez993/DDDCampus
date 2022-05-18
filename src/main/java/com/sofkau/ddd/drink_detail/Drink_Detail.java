package com.sofkau.ddd.drink_detail;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkau.ddd.drink_detail.values.Drink_Detail_Id;

public class Drink_Detail extends AggregateEvent<Drink_Detail_Id> {

    public Drink_Detail(Drink_Detail_Id entityId) {
        super(entityId);
    }
}
