package com.sofkau.ddd.drink_detail.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.ddd.drink_detail.values.Drink_Detail_Id;
import com.sofkau.ddd.drink_detail.values.Soda_Id;
import com.sofkau.ddd.generic.Value;

public class UpdateSodaValue extends Command {
    private final Drink_Detail_Id entityId;
    private final Soda_Id soda_id;
    private final Value value;

    public UpdateSodaValue(Drink_Detail_Id entityId, Soda_Id soda_id, Value value) {
        this.entityId = entityId;
        this.soda_id = soda_id;
        this.value = value;
    }

    public Drink_Detail_Id getEntityId() {
        return entityId;
    }

    public Soda_Id getSoda_id() {
        return soda_id;
    }

    public Value getValue() {
        return value;
    }
}
