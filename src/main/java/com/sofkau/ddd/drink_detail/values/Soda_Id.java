package com.sofkau.ddd.drink_detail.values;

import co.com.sofka.domain.generic.Identity;
import com.sofkau.ddd.drink_detail.values.Soda_Id;

public class Soda_Id  extends Identity {
    public Soda_Id( ) {
    }

    public Soda_Id(String id){
        super(id);
    }

    public static Soda_Id of(String id){
        return new Soda_Id(id);
    }
}
