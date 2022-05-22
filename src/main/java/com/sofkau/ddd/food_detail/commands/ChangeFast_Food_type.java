package com.sofkau.ddd.food_detail.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.ddd.food_detail.values.Fast_Food_Id;
import com.sofkau.ddd.food_detail.values.Fast_Food_Type;
import com.sofkau.ddd.food_detail.values.Food_Detail_Id;

public class ChangeFast_Food_type extends Command {
    private final Food_Detail_Id entityId;
    private final Fast_Food_Id fast_food_id;
    private final Fast_Food_Type fast_food_type;

    public ChangeFast_Food_type(Food_Detail_Id entityId, Fast_Food_Id fast_food_id, Fast_Food_Type fast_food_type) {
        this.entityId = entityId;
        this.fast_food_id = fast_food_id;
        this.fast_food_type = fast_food_type;
    }

    public Food_Detail_Id getEntityId() {
        return entityId;
    }

    public Fast_Food_Id getFast_food_id() {
        return fast_food_id;
    }

    public Fast_Food_Type getFast_food_type() {
        return fast_food_type;
    }
}
