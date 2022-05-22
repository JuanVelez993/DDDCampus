package com.sofkau.ddd.food_detail.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.ddd.food_detail.values.Fast_Food_Id;
import com.sofkau.ddd.food_detail.values.Fast_Food_Type;
import com.sofkau.ddd.food_detail.values.Food_Detail_Id;
import com.sofkau.ddd.food_detail.values.Value;

public class AddFast_Food extends Command {
    private final Food_Detail_Id food_detail_id;
    private final Fast_Food_Id entityId;
    private final Fast_Food_Type fast_food_type;
    private final Value value;

    public AddFast_Food(Food_Detail_Id food_detail_id, Fast_Food_Id entityId, Fast_Food_Type fast_food_type, Value value) {
        this.food_detail_id=food_detail_id;
        this.entityId = entityId;
        this.fast_food_type = fast_food_type;
        this.value = value;
    }

    public Food_Detail_Id getFood_detail_id() {
        return food_detail_id;
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
