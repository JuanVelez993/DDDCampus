package com.sofkau.ddd.drink_detail.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.ddd.drink_detail.values.Drink_Detail_Id;
import com.sofkau.ddd.drink_detail.values.Slushy_Flavor;
import com.sofkau.ddd.drink_detail.values.Slushy_Id;

public class UpdateSlushy_flavor extends Command {
    private final Drink_Detail_Id entityId;
    private final Slushy_Id slushy_id;
    private final Slushy_Flavor slushy_flavor;

    public UpdateSlushy_flavor(Drink_Detail_Id entityId, Slushy_Id slushy_id, Slushy_Flavor slushy_flavor) {
        this.entityId = entityId;
        this.slushy_id = slushy_id;
        this.slushy_flavor = slushy_flavor;
    }

    public Drink_Detail_Id getEntityId() {
        return entityId;
    }

    public Slushy_Id getSlushy_id() {
        return slushy_id;
    }

    public Slushy_Flavor getSlushy_flavor() {
        return slushy_flavor;
    }
}
