package com.sofkau.ddd.food_detail.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.ddd.food_detail.values.Food_Detail_Id;
import com.sofkau.ddd.food_detail.values.Snack_Id;
import com.sofkau.ddd.generic.Value;

public class UpdateSnackValue extends Command {
    private final Food_Detail_Id entityId;
    private final Snack_Id snack_id;
    private final Value value;

    public UpdateSnackValue(Food_Detail_Id entityId, Snack_Id snack_id, Value value) {
        this.entityId = entityId;
        this.snack_id = snack_id;
        this.value = value;
    }

    public Food_Detail_Id getEntityId() {
        return entityId;
    }

    public Snack_Id getSnack_id() {
        return snack_id;
    }

    public Value getValue() {
        return value;
    }
}
