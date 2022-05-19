package com.sofkau.ddd.food_detail.values;

import co.com.sofka.domain.generic.Identity;

public class Food_Detail_Id extends Identity {

    public Food_Detail_Id(Food_Detail_Id food_detail_id){
    }

    public Food_Detail_Id(String id){
        super(id);
    }

    public static Food_Detail_Id of(String id){
        return new Food_Detail_Id(id);
    }

}
