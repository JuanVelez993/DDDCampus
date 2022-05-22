package com.sofkau.ddd.food_detail.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.food_detail.values.Food_Value;

public class FoodDetailCreated extends DomainEvent {
    private final Food_Value food_value;
    public FoodDetailCreated(Food_Value food_value) {
        super("sofka.food.fooddetailcreated");
        this.food_value=food_value;
    }

    public Food_Value getFood_value() {
        return food_value;
    }
}
