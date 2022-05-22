package com.sofkau.ddd.food_detail.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.food_detail.values.Fast_Food_Id;
import com.sofkau.ddd.food_detail.values.Fast_Food_Type;
import com.sofkau.ddd.food_detail.values.Value;

public class Fast_FoodAdded extends DomainEvent {
    private final Fast_Food_Id entityId;
    private final Fast_Food_Type fast_food_type;
    private final Value value;
    public Fast_FoodAdded(Fast_Food_Id entityId,Fast_Food_Type fast_food_type,Value value) {
        super("sofka.food.fastfoodadded");
        this.entityId=entityId;
        this.fast_food_type=fast_food_type;
        this.value=value;
    }

    public Fast_Food_Id getEntityId() {
        return entityId;
    }

    public Fast_Food_Type getFast_food_type() {
        return fast_food_type;
    }

    public Value getValue() {
        return value;
    }
}
