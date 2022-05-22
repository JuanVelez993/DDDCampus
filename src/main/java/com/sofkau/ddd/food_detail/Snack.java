package com.sofkau.ddd.food_detail;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.ddd.food_detail.values.Snack_Id;
import com.sofkau.ddd.food_detail.values.Snack_Name;
import com.sofkau.ddd.generic.Value;

import java.util.Objects;

public class Snack extends Entity<Snack_Id> {
    protected Snack_Name snack_name;
    protected Value value;
    public Snack(Snack_Id entityId,Snack_Name snack_name,Value value) {
        super(entityId);
        this.snack_name=snack_name;
        this.value=value;
    }

    public void changeSnackName(Snack_Name snack_name){
        this.snack_name= Objects.requireNonNull(snack_name);
    }

    public void updateValue(Value value){
        this.value= Objects.requireNonNull(value);
    }

    public Snack_Name Snack_name() {
        return snack_name;
    }

    public Value Value() {
        return value;
    }
}
