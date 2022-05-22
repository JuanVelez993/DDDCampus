package com.sofkau.ddd.food_detail.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.ddd.food_detail.values.Fast_Food_Id;
import com.sofkau.ddd.food_detail.values.Food_Detail_Id;
import com.sofkau.ddd.food_detail.values.Value;

public class UpdateFast_FoodValue extends Command {
    private final Food_Detail_Id entityId;
    private final Fast_Food_Id fast_food_id;
    private final Value value;

    public UpdateFast_FoodValue(Food_Detail_Id entityId, Fast_Food_Id fast_food_id, Value value) {
        this.entityId = entityId;
        this.fast_food_id = fast_food_id;
        this.value = value;
    }

    public Food_Detail_Id getEntityId() {
        return entityId;
    }

    public Fast_Food_Id getFast_food_id() {
        return fast_food_id;
    }

    public Value getValue() {
        return value;
    }
}
