package com.sofkau.ddd.food_detail.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.food_detail.values.Fast_Food_Id;
import com.sofkau.ddd.food_detail.values.Fast_Food_Type;
import com.sofkau.ddd.food_detail.values.Food_Detail_Id;
import com.sofkau.ddd.food_detail.values.Food_Value;

public class Fast_Food_typeChanged extends DomainEvent {
    private final Fast_Food_Id fast_food_id;
    private final Fast_Food_Type fast_food_type;
    public Fast_Food_typeChanged(Fast_Food_Id fast_food_id, Fast_Food_Type fast_food_type) {
        super("sofka.food.fastfoodtypeupdated");
        this.fast_food_id = fast_food_id;
        this.fast_food_type=fast_food_type;
    }

    public Fast_Food_Id getFast_food_id() {
        return fast_food_id;
    }

    public Fast_Food_Type getFast_food_type() {
        return fast_food_type;
    }
}
