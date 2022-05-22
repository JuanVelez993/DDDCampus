package com.sofkau.ddd.food_detail.values;

import co.com.sofka.domain.generic.Identity;
import com.sofkau.ddd.food_detail.values.Snack_Id;

public class Snack_Id extends Identity {
    public Snack_Id( ) {
    }

    public Snack_Id(String id){
        super(id);
    }

    public static Snack_Id of(String id){
        return new Snack_Id(id);
    }
}
