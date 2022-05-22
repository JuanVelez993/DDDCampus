package com.sofkau.ddd.drink_detail.values;

import co.com.sofka.domain.generic.Identity;
import com.sofkau.ddd.drink_detail.values.Slushy_Id;

public class Slushy_Id extends Identity {
    public Slushy_Id( ) {
    }

    public Slushy_Id(String id){
        super(id);
    }

    public static Slushy_Id of(String id){
        return new Slushy_Id(id);
    }
}
