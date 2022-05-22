package com.sofkau.ddd.drink_detail.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.ddd.drink_detail.values.Drink_Detail_Id;
import com.sofkau.ddd.drink_detail.values.Drink_Value;

public class UpdateDrink_Value extends Command {
    private final Drink_Detail_Id entityId;
    private final Drink_Detail_Id drinkDetailId;
    private final Drink_Value drink_value;

    public UpdateDrink_Value(Drink_Detail_Id entityId, Drink_Detail_Id drinkDetailId, Drink_Value drink_value) {
        this.entityId = entityId;
        this.drinkDetailId = drinkDetailId;
        this.drink_value = drink_value;
    }

    public Drink_Detail_Id getEntityId() {
        return entityId;
    }

    public Drink_Detail_Id getDrinkDetailId() {
        return drinkDetailId;
    }

    public Drink_Value getDrink_value() {
        return drink_value;
    }
}
