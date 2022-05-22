package com.sofkau.ddd.drink_detail.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.ddd.drink_detail.values.Drink_Detail_Id;
import com.sofkau.ddd.drink_detail.values.Drink_Value;

public class CreateDrink_Detail extends Command {
    private final Drink_Detail_Id entityId;
    private final Drink_Value drink_value;

    public CreateDrink_Detail(Drink_Detail_Id entityId, Drink_Value drink_value) {
        this.entityId = entityId;
        this.drink_value = drink_value;
    }

    public Drink_Detail_Id getEntityId() {
        return entityId;
    }

    public Drink_Value getDrink_value() {
        return drink_value;
    }
}
