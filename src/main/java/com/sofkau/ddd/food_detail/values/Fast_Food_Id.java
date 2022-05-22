package com.sofkau.ddd.food_detail.values;

import co.com.sofka.domain.generic.Identity;
import com.sofkau.ddd.food_detail.values.Fast_Food_Id;

public class Fast_Food_Id extends Identity {
    public Fast_Food_Id( ) {
    }

    public Fast_Food_Id(String id){
        super(id);
    }

    public static Fast_Food_Id of(String id){
        return new Fast_Food_Id(id);
    }
}
