package com.sofkau.ddd.food_detail;

import co.com.sofka.domain.generic.EventChange;
import com.sofkau.ddd.food_detail.events.*;
import com.sofkau.ddd.order.Employee;
import com.sofkau.ddd.order.events.EmployeeAdded;
import com.sofkau.ddd.order.events.EmployeeNameUpdated;


import java.util.HashSet;

public class Food_DetailChange extends EventChange {
    public Food_DetailChange(Food_Detail food_detail) {

        apply((FoodDetailCreated event)-> {
            food_detail.food_value= event.getFood_value();
            food_detail.popcorns=new HashSet<>();
            food_detail.fast_foods=new HashSet<>();
            food_detail.snacks=new HashSet<>();
        });

        apply((Food_ValueUpdated event)-> {
            food_detail.food_value=event.getFood_value();
        });

        apply((PopcornAdded event)-> {
            food_detail.popcorns.add(new Popcorn(event.getEntityId(), event.getPopcorn_type(), event.getValue()));

        });

        apply((Popcorn_typeChanged event)-> {
            var popcorn = food_detail.getPopcornById(event.getEntityId()).orElseThrow(()-> new IllegalArgumentException("Could not reach the popcorn"));
            popcorn.changePopcorn_Type(event.getPopcorn_type());

        });

        apply((PopcornValuedUpdated event)-> {
            var popcorn = food_detail.getPopcornById(event.getPopcorn_id()).orElseThrow(()-> new IllegalArgumentException("Could not reach the popcorn"));
            popcorn.updateValue(event.getValue());

        });

        apply((Fast_FoodAdded event)-> {
            food_detail.fast_foods.add(new Fast_Food(event.getEntityId(), event.getFast_food_type(), event.getValue()));

        });

        apply((Fast_Food_typeChanged event)-> {
            var fastfood = food_detail.getFast_FoodById(event.getFast_food_id()).orElseThrow(()-> new IllegalArgumentException("Could not reach the fast food"));
            fastfood.changeFast_Food_Type(event.getFast_food_type());

        });

        apply((Fast_Food_ValueUpdated event)-> {
            var fastfood = food_detail.getFast_FoodById(event.getFast_food_id()).orElseThrow(()-> new IllegalArgumentException("Could not reach the fast food"));
            fastfood.updateValue(event.getValue());

        });

        apply((SnackAdded event)-> {
            food_detail.snacks.add(new Snack(event.getEntityId(), event.getSnack_name(), event.getValue()));

        });

        apply((Snack_nameChanged event)-> {
            var snack = food_detail.getSnackById(event.getSnack_id()).orElseThrow(()-> new IllegalArgumentException("Could not reach the snack"));
            snack.changeSnackName(event.getSnack_name());

        });

        apply((SnackValueUpdated event)-> {
            var snack = food_detail.getSnackById(event.getSnack_id()).orElseThrow(()-> new IllegalArgumentException("Could not reach the snack"));
            snack.updateValue(event.getValue());

        });

    }
}
