package com.sofkau.ddd.food_detail;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.ddd.food_detail.values.Popcorn_Id;
import com.sofkau.ddd.food_detail.values.Popcorn_Type;
import com.sofkau.ddd.generic.Value;

import java.util.Objects;

public class Popcorn extends Entity<Popcorn_Id> {
    protected Popcorn_Type popcorn_type;
    protected Value value;
    public Popcorn(Popcorn_Id entityId,Popcorn_Type popcorn_type,Value value) {
        super(entityId);
        this.popcorn_type=popcorn_type;
        this.value=value;
    }

    public void changePopcorn_Type(Popcorn_Type popcorn_type){
        this.popcorn_type= Objects.requireNonNull(popcorn_type);
    }

    public void updateValue(Value value){
        this.value= Objects.requireNonNull(value);
    }

    public Popcorn_Type Popcorn_type() {
        return popcorn_type;
    }

    public Value Value() {
        return value;
    }
}
