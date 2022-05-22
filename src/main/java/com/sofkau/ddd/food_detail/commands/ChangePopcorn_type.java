package com.sofkau.ddd.food_detail.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.ddd.food_detail.values.Food_Detail_Id;
import com.sofkau.ddd.food_detail.values.Popcorn_Id;
import com.sofkau.ddd.food_detail.values.Popcorn_Type;

public class ChangePopcorn_type extends Command {
    private final Food_Detail_Id entityId;
    private final Popcorn_Id popcorn_id;
    private final Popcorn_Type popcorn_type;

    public ChangePopcorn_type(Food_Detail_Id entityId, Popcorn_Id popcorn_id, Popcorn_Type popcorn_type) {
        this.entityId = entityId;
        this.popcorn_id = popcorn_id;
        this.popcorn_type = popcorn_type;
    }

    public Food_Detail_Id getEntityId() {
        return entityId;
    }

    public Popcorn_Id getPopcorn_id() {
        return popcorn_id;
    }

    public Popcorn_Type getPopcorn_type() {
        return popcorn_type;
    }
}
