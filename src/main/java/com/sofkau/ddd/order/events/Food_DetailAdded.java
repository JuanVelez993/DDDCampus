package com.sofkau.ddd.order.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.food_detail.values.Food_Detail_Id;

public class Food_DetailAdded extends DomainEvent {
    private final Food_Detail_Id food_detail_id;
    public Food_DetailAdded(Food_Detail_Id food_detail_id) {
        super("sofka.order.food_detailadded");
        this.food_detail_id=food_detail_id;

    }

    public Food_Detail_Id getFood_detail_id() {
        return food_detail_id;
    }
}
