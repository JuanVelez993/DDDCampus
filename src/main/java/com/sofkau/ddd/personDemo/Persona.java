package com.sofkau.ddd.personDemo;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkau.ddd.personDemo.values.PersonaId;



public class Persona extends AggregateEvent<PersonaId> {
    public Persona(PersonaId entityId) {
        super(entityId);
    }
}
