package com.sofkau.ddd.order.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.drink_detail.values.Drink_Detail_Id;

public class Drink_DetailAdded extends DomainEvent {
    private Drink_Detail_Id drink_detail_id;
    public Drink_DetailAdded(Drink_Detail_Id drink_detail_id) {
        super("sofka.order.ordercreated");
        this.drink_detail_id=drink_detail_id;
    }

    public Drink_Detail_Id getDrink_detail_id() {
        return drink_detail_id;
    }
}
