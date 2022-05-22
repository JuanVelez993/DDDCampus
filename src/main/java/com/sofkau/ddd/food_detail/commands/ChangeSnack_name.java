package com.sofkau.ddd.food_detail.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.ddd.food_detail.values.Food_Detail_Id;
import com.sofkau.ddd.food_detail.values.Snack_Id;
import com.sofkau.ddd.food_detail.values.Snack_Name;

public class ChangeSnack_name extends Command {
    private final Food_Detail_Id entityId;
    private final Snack_Id snack_id;
    private final Snack_Name snack_name;

    public ChangeSnack_name(Food_Detail_Id entityId, Snack_Id snack_id, Snack_Name snack_name) {
        this.entityId = entityId;
        this.snack_id = snack_id;
        this.snack_name = snack_name;
    }

    public Food_Detail_Id getEntityId() {
        return entityId;
    }

    public Snack_Id getSnack_id() {
        return snack_id;
    }

    public Snack_Name getSnack_name() {
        return snack_name;
    }
}
