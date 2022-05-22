package com.sofkau.ddd.drink_detail.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.ddd.drink_detail.values.Drink_Detail_Id;
import com.sofkau.ddd.drink_detail.values.Soda_Id;
import com.sofkau.ddd.drink_detail.values.Soda_Type;

public class ChangeSoda_type extends Command {
    private final Drink_Detail_Id entityId;
    private final Soda_Id soda_id;
    private final Soda_Type soda_type;

    public ChangeSoda_type(Drink_Detail_Id entityId, Soda_Id soda_id, Soda_Type soda_type) {
        this.entityId = entityId;
        this.soda_id = soda_id;
        this.soda_type = soda_type;
    }

    public Drink_Detail_Id getEntityId() {
        return entityId;
    }

    public Soda_Id getSoda_id() {
        return soda_id;
    }

    public Soda_Type getSoda_type() {
        return soda_type;
    }
}
