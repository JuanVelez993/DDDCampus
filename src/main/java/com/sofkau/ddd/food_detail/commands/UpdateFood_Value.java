package com.sofkau.ddd.food_detail.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.ddd.food_detail.values.Food_Detail_Id;
import com.sofkau.ddd.food_detail.values.Food_Value;

public class UpdateFood_Value extends Command {
    private final Food_Detail_Id foodDetailId;
    private final Food_Value food_value;

    public UpdateFood_Value(Food_Detail_Id foodDetailId, Food_Value food_value) {
        this.foodDetailId = foodDetailId;
        this.food_value = food_value;
    }

    public Food_Detail_Id getFoodDetailId() {
        return foodDetailId;
    }

    public Food_Value getFood_value() {
        return food_value;
    }
}
