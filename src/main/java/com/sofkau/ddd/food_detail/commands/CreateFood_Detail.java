package com.sofkau.ddd.food_detail.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.ddd.food_detail.values.Food_Detail_Id;
import com.sofkau.ddd.food_detail.values.Food_Value;

public class CreateFood_Detail extends Command {
    private final Food_Detail_Id entityId;
    private final Food_Value food_value;

    public CreateFood_Detail(Food_Detail_Id entityId, Food_Value food_value) {
        this.entityId = entityId;
        this.food_value = food_value;
    }

    public Food_Detail_Id getEntityId() {
        return entityId;
    }

    public Food_Value getFood_value() {
        return food_value;
    }
}
