package com.sofkau.ddd.order.values;

import co.com.sofka.domain.generic.Identity;

public class Employee_Id extends Identity {
    public Employee_Id( ) {
    }

    public Employee_Id(String id){
        super(id);
    }

    public static Employee_Id of(String id){
        return new Employee_Id(id);
    }
}
