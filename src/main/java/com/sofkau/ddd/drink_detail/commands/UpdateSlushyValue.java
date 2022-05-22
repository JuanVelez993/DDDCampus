package com.sofkau.ddd.drink_detail.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.ddd.drink_detail.values.Drink_Detail_Id;
import com.sofkau.ddd.drink_detail.values.Slushy_Id;
import com.sofkau.ddd.generic.Value;

public class UpdateSlushyValue extends Command {
    private final Drink_Detail_Id entityId;
    private final Slushy_Id slushy_id;
    private final Value value;

    public UpdateSlushyValue(Drink_Detail_Id entityId, Slushy_Id slushy_id, Value value) {
        this.entityId = entityId;
        this.slushy_id = slushy_id;
        this.value = value;
    }

    public Drink_Detail_Id getEntityId() {
        return entityId;
    }

    public Slushy_Id getSlushy_id() {
        return slushy_id;
    }

    public Value getValue() {
        return value;
    }
}
