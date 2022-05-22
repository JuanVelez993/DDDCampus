package com.sofkau.ddd.drink_detail.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.drink_detail.values.Drink_Value;

public class Drink_DetailCreated extends DomainEvent {
    private final Drink_Value drink_value;
    public Drink_DetailCreated(Drink_Value drink_value) {
        super("sofka.drink.drinkdetailcreated");
        this.drink_value=drink_value;
    }

    public Drink_Value getDrink_value() {
        return drink_value;
    }
}
