package com.sofkau.ddd.drink_detail;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.drink_detail.events.*;
import com.sofkau.ddd.drink_detail.values.*;
import com.sofkau.ddd.food_detail.Fast_Food;
import com.sofkau.ddd.food_detail.events.Fast_FoodAdded;
import com.sofkau.ddd.food_detail.events.Fast_Food_ValueUpdated;
import com.sofkau.ddd.food_detail.events.Fast_Food_typeChanged;
import com.sofkau.ddd.food_detail.values.Fast_Food_Id;
import com.sofkau.ddd.food_detail.values.Fast_Food_Type;


import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Drink_Detail extends AggregateEvent<Drink_Detail_Id> {
    protected Drink_Value drink_value;
    protected Set<Soda> sodas;
    protected Set<Slushy> slushies;

    public Drink_Detail(Drink_Detail_Id entityId,Drink_Value drink_value) {
        super(entityId);
        appendChange(new Drink_DetailCreated(drink_value)).apply();
    }

    private Drink_Detail(Drink_Detail_Id entityId){
        super(entityId);
        subscribe(new Drink_DetailChange(this));
    }

    public static Drink_Detail from(Drink_Detail_Id drinkDetailId, List<DomainEvent> events){
        var drinkDetail = new Drink_Detail(drinkDetailId);
        events.forEach(drinkDetail::applyEvent);
        return drinkDetail;
    }

    public void updateDrink_Value(Drink_Detail_Id drinkDetailId, Drink_Value drink_value){
        appendChange(new Drink_valueUpdated(drinkDetailId,drink_value)).apply();
    }

    public void addSoda(Soda_Id entityId, Soda_Type soda_type, Value value) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(soda_type);
        Objects.requireNonNull(value);
        appendChange(new SodaAdded(entityId,soda_type,value)).apply();

    }

    public void changeSoda_Type(Soda_Id entityId, Soda_Type soda_type){
        appendChange(new Soda_typeChanged(entityId,soda_type)).apply();
    }

    public void updateSoda_Value(Soda_Id entityId,Value value){
        appendChange(new SodaValueUpdated(entityId,value)).apply();
    }

    public void addSlushy(Slushy_Id slushy_id, Slushy_Flavor slushy_flavor, Value value) {
        Objects.requireNonNull(slushy_id);
        Objects.requireNonNull(slushy_flavor);
        Objects.requireNonNull(value);
        appendChange(new SlushyAdded(slushy_id,slushy_flavor,value)).apply();

    }

    public void updateSlushy_Flavor(Slushy_Id slushy_id, Slushy_Flavor slushy_flavor){
        appendChange(new Slushy_FlavorUpdated(slushy_id,slushy_flavor)).apply();
    }

    public void updateSlushy_Value(Slushy_Id slushy_id,Value value){
        appendChange(new SlushyValueUpdated(slushy_id,value)).apply();
    }

    public Optional<Soda> getSodaById(Soda_Id soda_id){
        return sodas.stream().filter(soda -> soda.identity().equals(soda_id)).findFirst();
    }

    public Optional<Slushy> getSlushyById(Slushy_Id slushy_id){
        return slushies.stream().filter(slushy -> slushy.identity().equals(slushy_id)).findFirst();
    }

    public Drink_Value Drink_value() {
        return drink_value;
    }

    public Set<Soda> Sodas() {
        return sodas;
    }

    public Set<Slushy> Slushies() {
        return slushies;
    }
}
