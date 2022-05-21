package com.sofkau.ddd.order.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.ddd.drink_detail.values.Drink_Detail_Id;
import com.sofkau.ddd.order.values.Order_Id;

public class AddDrink_Detail extends Command {
    private final Order_Id orderId;
    private final Drink_Detail_Id drink_detail_id;


    public AddDrink_Detail(Order_Id orderId, Drink_Detail_Id drink_detail_id) {
        this.orderId = orderId;
        this.drink_detail_id = drink_detail_id;
    }

    public Order_Id getOrderId() {
        return orderId;
    }

    public Drink_Detail_Id getDrink_detail_id() {
        return drink_detail_id;
    }
}
