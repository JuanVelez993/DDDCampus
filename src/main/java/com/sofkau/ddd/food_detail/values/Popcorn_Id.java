package com.sofkau.ddd.food_detail.values;

import co.com.sofka.domain.generic.Identity;
import com.sofkau.ddd.food_detail.values.Popcorn_Id;

public class Popcorn_Id extends Identity {
    public Popcorn_Id( ) {
    }

    public Popcorn_Id(String id){
        super(id);
    }

    public static Popcorn_Id of(String id){
        return new Popcorn_Id(id);
    }
}
