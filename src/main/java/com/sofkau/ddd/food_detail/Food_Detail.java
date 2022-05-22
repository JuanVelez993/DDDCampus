package com.sofkau.ddd.food_detail;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.food_detail.events.*;
import com.sofkau.ddd.food_detail.values.*;


import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Food_Detail extends AggregateEvent<Food_Detail_Id> {
    protected Food_Value food_value;
    protected Set<Popcorn> popcorns;
    protected Set<Fast_Food> fast_foods;
    protected Set<Snack> snacks;


    public Food_Detail(Food_Detail_Id entityId,Food_Value food_value) {
        super(entityId);
        appendChange(new FoodDetailCreated(food_value)).apply();
    }

    private Food_Detail(Food_Detail_Id entityId){
        super(entityId);
        subscribe(new Food_DetailChange(this));
    }

    public static Food_Detail from(Food_Detail_Id foodDetailId, List<DomainEvent> events){
        var foodDetail = new Food_Detail(foodDetailId);
        events.forEach(foodDetail::applyEvent);
        return foodDetail;
    }

    public void updateFood_Value(Food_Detail_Id foodDetailId,Food_Value food_value){
        appendChange(new Food_ValueUpdated(foodDetailId,food_value)).apply();
    }

    public void addFast_Food(Fast_Food_Id entityId,Fast_Food_Type fast_food_type,Value value) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(fast_food_type);
        Objects.requireNonNull(value);
        appendChange(new Fast_FoodAdded(entityId,fast_food_type,value)).apply();

    }

    public void changeFast_Food_Type(Fast_Food_Id fast_food_id, Fast_Food_Type fast_food_type){
        appendChange(new Fast_Food_typeChanged(fast_food_id,fast_food_type)).apply();
    }

    public void updateFast_Food_Value(Fast_Food_Id fast_food_id, Value value){
        appendChange(new Fast_Food_ValueUpdated(fast_food_id,value)).apply();
    }

    public void addPopcorn(Popcorn_Id entityId,Popcorn_Type popcorn_type,Value value) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(popcorn_type);
        Objects.requireNonNull(value);
        appendChange(new PopcornAdded(entityId,popcorn_type,value)).apply();

    }

    public void changePopcorn_Type(Popcorn_Id entityId,Popcorn_Type popcorn_type){
        appendChange(new Popcorn_typeChanged(entityId,popcorn_type)).apply();
    }

    public void updatePopcorn_value(Popcorn_Id popcorn_id, Value value){
        appendChange(new PopcornValuedUpdated(popcorn_id,value)).apply();
    }

    public void addSnack(Snack_Id entityId,Snack_Name snack_name,Value value) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(snack_name);
        Objects.requireNonNull(value);
        appendChange(new SnackAdded(entityId,snack_name,value)).apply();

    }

    public void changeSnack_Type(Snack_Id snack_id,Snack_Name snack_name){
        appendChange(new Snack_nameChanged(snack_id,snack_name)).apply();
    }

    public void updateSnack_value(Snack_Id snack_id, Value value){
        appendChange(new SnackValueUpdated(snack_id,value)).apply();
    }

    public Optional<Popcorn> getPopcornById(Popcorn_Id popcorn_id){
        return popcorns.stream().filter(popcorn -> popcorn.identity().equals(popcorn_id)).findFirst();
    }

    public Optional<Fast_Food> getFast_FoodById(Fast_Food_Id fast_food_id){
        return fast_foods.stream().filter(fast_food -> fast_food.identity().equals(fast_food_id)).findFirst();
    }

    public Optional<Snack> getSnackById(Snack_Id snack_id){
        return snacks.stream().filter(snack -> snack.identity().equals(snack_id)).findFirst();
    }


    public Food_Value Food_value() {
        return food_value;
    }

    public Set<Popcorn> Popcorns() {
        return popcorns;
    }

    public Set<Fast_Food> Fast_foods() {
        return fast_foods;
    }

    public Set<Snack> Snacks() {
        return snacks;
    }
}
