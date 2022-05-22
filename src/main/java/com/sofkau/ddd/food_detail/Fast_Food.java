package com.sofkau.ddd.food_detail;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.ddd.food_detail.values.Fast_Food_Id;
import com.sofkau.ddd.food_detail.values.Fast_Food_Type;
import com.sofkau.ddd.generic.Value;

import java.util.Objects;

public class Fast_Food extends Entity<Fast_Food_Id> {
    protected Fast_Food_Type fast_food_type;
    protected Value value;

    public Fast_Food(Fast_Food_Id entityId,Fast_Food_Type fast_food_type,Value value) {
        super(entityId);
        this.entityId=entityId;
        this.fast_food_type=fast_food_type;
        this.value=value;

    }

    public void changeFast_Food_Type(Fast_Food_Type fast_food_type){
        this.fast_food_type= Objects.requireNonNull(fast_food_type);
    }

    public void updateValue(Value value){
        this.value= Objects.requireNonNull(value);
    }

    public Fast_Food_Type Fast_food_type() {
        return fast_food_type;
    }

    public Value Value() {
        return value;
    }
}
