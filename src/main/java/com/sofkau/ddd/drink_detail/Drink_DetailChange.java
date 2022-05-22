package com.sofkau.ddd.drink_detail;

import co.com.sofka.domain.generic.EventChange;
import com.sofkau.ddd.drink_detail.events.*;
import com.sofkau.ddd.drink_detail.events.SodaAdded;
import com.sofkau.ddd.drink_detail.events.Soda_typeChanged;
import com.sofkau.ddd.drink_detail.events.SlushyAdded;



import java.util.HashSet;

public class Drink_DetailChange extends EventChange {
    public Drink_DetailChange(Drink_Detail drink_detail) {

        apply((Drink_DetailCreated event)-> {
            drink_detail.drink_value= event.getDrink_value();
            drink_detail.sodas=new HashSet<>();
            drink_detail.slushies=new HashSet<>();

        });

        apply((Drink_valueUpdated event)-> {
            drink_detail.drink_value=event.getDrink_value();
        });

        apply((SodaAdded event)-> {
            drink_detail.sodas.add(new Soda(event.getEntityId(), event.getSoda_type(), event.getValue()));

        });

        apply((Soda_typeChanged event)-> {
            var soda = drink_detail.getSodaById(event.getEntityId()).orElseThrow(()-> new IllegalArgumentException("Could not reach the soda"));
            soda.changeSoda_Type(event.getSoda_type());

        });

        apply((SodaValueUpdated event)-> {
            var soda = drink_detail.getSodaById(event.getEntityId()).orElseThrow(()-> new IllegalArgumentException("Could not reach the soda"));
            soda.updateValue(event.getValue());

        });

        apply((SlushyAdded event)-> {
            drink_detail.slushies.add(new Slushy(event.getSlushy_id(), event.getSlushy_flavor(), event.getValue()));

        });

        apply((Slushy_FlavorUpdated event)-> {
            var slushy = drink_detail.getSlushyById(event.getSlushy_id()).orElseThrow(()-> new IllegalArgumentException("Could not reach the slushy"));
            slushy.updateSlushy_Flavor(event.getSlushy_flavor());

        });

        apply((SlushyValueUpdated event)-> {
            var slushy = drink_detail.getSlushyById(event.getSlushy_id()).orElseThrow(()-> new IllegalArgumentException("Could not reach the slushy"));
            slushy.updateValue(event.getValue());

        });


    }
}
