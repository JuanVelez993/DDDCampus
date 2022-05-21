package com.sofkau.ddd.order.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.ddd.food_detail.values.Food_Detail_Id;
import com.sofkau.ddd.order.values.Order_Id;

public class AddFood_Detail extends Command {
    private final Order_Id orderId;
    private final Food_Detail_Id food_detail_id;

    public AddFood_Detail(Order_Id orderId, Food_Detail_Id food_detail_id) {
        this.orderId = orderId;
        this.food_detail_id = food_detail_id;
    }

    public Order_Id getOrderId() {
        return orderId;
    }

    public Food_Detail_Id getFood_detail_id() {
        return food_detail_id;
    }
}
