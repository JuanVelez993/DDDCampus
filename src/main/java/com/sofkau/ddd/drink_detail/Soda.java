package com.sofkau.ddd.drink_detail;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.ddd.drink_detail.values.Soda_Id;
import com.sofkau.ddd.drink_detail.values.Soda_Type;
import com.sofkau.ddd.drink_detail.values.Value;
import com.sofkau.ddd.food_detail.values.Snack_Name;

import java.util.Objects;

public class Soda extends Entity<Soda_Id> {
   protected Soda_Type soda_type;
    protected Value value;

    public Soda(Soda_Id entityId,Soda_Type soda_type,Value value) {
        super(entityId);
        this.soda_type=soda_type;
        this.value=value;
    }

    public void changeSoda_Type(Soda_Type soda_type){
        this.soda_type= Objects.requireNonNull(soda_type);
    }

    public void updateValue(Value value){
        this.value= Objects.requireNonNull(value);
    }

    public Soda_Type Soda_type() {
        return soda_type;
    }

    public Value Value() {
        return value;
    }
}
