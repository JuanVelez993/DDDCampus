package com.sofkau.ddd.drink_detail.values;

import co.com.sofka.domain.generic.Identity;
import com.sofkau.ddd.drink_detail.values.Drink_Detail_Id;

public class Drink_Detail_Id extends Identity {
    public Drink_Detail_Id(Drink_Detail_Id drink_detail_id) {
    }

    public Drink_Detail_Id(String id){
        super(id);
    }

    public static Drink_Detail_Id of(String id){
        return new Drink_Detail_Id(id);
    }
}
