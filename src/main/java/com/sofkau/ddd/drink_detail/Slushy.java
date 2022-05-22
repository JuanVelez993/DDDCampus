package com.sofkau.ddd.drink_detail;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.ddd.drink_detail.values.Slushy_Flavor;
import com.sofkau.ddd.drink_detail.values.Slushy_Id;
import com.sofkau.ddd.drink_detail.values.Soda_Type;
import com.sofkau.ddd.drink_detail.values.Value;

import java.util.Objects;

public class Slushy extends Entity<Slushy_Id> {
    protected Slushy_Flavor slushy_flavor;
    protected Value value;

    public Slushy(Slushy_Id entityId,Slushy_Flavor slushy_flavor,Value value) {
        super(entityId);
        this.slushy_flavor=slushy_flavor;
        this.value=value;
    }

    public void updateSlushy_Flavor(Slushy_Flavor slushy_flavor){
        this.slushy_flavor =Objects.requireNonNull(slushy_flavor);
    }

    public void updateValue(Value value){
        this.value= Objects.requireNonNull(value);
    }

    public Slushy_Flavor Slushy_flavor() {
        return slushy_flavor;
    }

    public Value Value() {
        return value;
    }
}
