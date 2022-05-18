package com.sofkau.ddd.food_detail;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkau.ddd.food_detail.values.Food_Detail_Id;

public class Food_Detail extends AggregateEvent<Food_Detail_Id> {
    public Food_Detail(Food_Detail_Id entityId) {
        super(entityId);
    }
}
