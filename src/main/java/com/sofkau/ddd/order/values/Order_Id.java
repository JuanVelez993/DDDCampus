package com.sofkau.ddd.order.values;

import co.com.sofka.domain.generic.Identity;

public class Order_Id extends Identity {
    public Order_Id( ) {
    }

    public Order_Id(String id){
        super(id);
    }

    public static Order_Id of(String id){
        return new Order_Id(id);
    }
}
