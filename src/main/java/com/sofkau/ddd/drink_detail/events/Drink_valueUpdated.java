package com.sofkau.ddd.drink_detail.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.drink_detail.values.Drink_Detail_Id;
import com.sofkau.ddd.drink_detail.values.Drink_Value;


public class Drink_valueUpdated extends DomainEvent {
    private final Drink_Detail_Id drink_detail_id;
    private final Drink_Value drink_value;
    public Drink_valueUpdated(Drink_Detail_Id drinkDetailId, Drink_Value drink_value) {
        super("sofka.drink.drinkvalueupdated");
        this.drink_detail_id=drinkDetailId;
        this.drink_value=drink_value;
    }

    public Drink_Detail_Id getDrink_detail_id() {
        return drink_detail_id;
    }

    public Drink_Value getDrink_value() {
        return drink_value;
    }
}
