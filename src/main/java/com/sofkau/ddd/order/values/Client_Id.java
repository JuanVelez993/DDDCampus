package com.sofkau.ddd.order.values;

import co.com.sofka.domain.generic.Identity;
import com.sofkau.ddd.order.values.Client_Id;

public class Client_Id extends Identity {
    public Client_Id( ) {
    }

    public Client_Id(String id){
        super(id);
    }

    public static Client_Id of(String id){
        return new Client_Id(id);
    }
}
