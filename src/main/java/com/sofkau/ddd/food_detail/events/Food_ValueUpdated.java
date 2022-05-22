package com.sofkau.ddd.food_detail.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.food_detail.values.Food_Detail_Id;
import com.sofkau.ddd.food_detail.values.Food_Value;

public class Food_ValueUpdated extends DomainEvent {
    private final Food_Detail_Id food_detail_id;
    private final Food_Value food_value;
    public Food_ValueUpdated(Food_Detail_Id food_detail_id,Food_Value food_value) {
        super("sofka.food.foodvalueupdated");
        this.food_detail_id=food_detail_id;
        this.food_value=food_value;
    }

    public Food_Detail_Id getFood_detail_id() {
        return food_detail_id;
    }

    public Food_Value getFood_value() {
        return food_value;
    }
}
