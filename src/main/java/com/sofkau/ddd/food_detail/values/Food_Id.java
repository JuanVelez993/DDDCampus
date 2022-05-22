package com.sofkau.ddd.food_detail.values;


import co.com.sofka.domain.generic.Identity;

public class Food_Id extends Identity {
    public Food_Id( ) {
    }

    public Food_Id(String id){
        super(id);
    }

    public static Food_Id of(String id){
        return new Food_Id(id);
    }
}
