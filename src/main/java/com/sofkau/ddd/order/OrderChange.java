package com.sofkau.ddd.order;

import co.com.sofka.domain.generic.EventChange;
import com.sofkau.ddd.drink_detail.values.Drink_Detail_Id;
import com.sofkau.ddd.food_detail.values.Food_Detail_Id;
import com.sofkau.ddd.order.events.*;

import java.util.HashSet;

public class OrderChange extends EventChange {
    public OrderChange(Order order) {
        apply((OrderCreated event)-> {
            order.employees= new HashSet<>();
            order.clients = new HashSet<>();
            order.order_date= event.getOrder_date();
            order.food_detail_id=new HashSet<>();
            order.drink_detail_id=new HashSet<>();
        });

        apply((Food_DetailAdded event)-> {
            order.food_detail_id.add(new Food_Detail_Id(event.getFood_detail_id()));
        });

        apply((Drink_DetailAdded event)-> {
            order.drink_detail_id.add(new Drink_Detail_Id(event.getDrink_detail_id()));
        });

        apply((Order_DateUpdated event)-> {
            order.order_date=event.getOrder_date();
        });

        apply((EmployeeAdded event)-> {
            order.employees.add(new Employee(event.getEmployee_id(), event.getEmployee_type(), event.getName()));

        });

        apply((EmployeeNameUpdated event)-> {
            var employee = order.getEmployeeById(event.getEmployee_id()).orElseThrow(()-> new IllegalArgumentException("Could not reach the employee"));
            employee.updateName(event.getName());

        });

        apply((Employee_TypeChanged event)-> {
            var employee=order.getEmployeeById(event.getEmployee_id()).orElseThrow(()-> new IllegalArgumentException("Could not to reach the employee"));
            employee.changeEmployee_Type(event.getEmployee_type());
        });

        apply((ClientAdded event)-> {
            order.clients.add(new Client(event.getClient_id(), event.getName(), event.getPayment()));

        });

        apply((ClientNameUpdated event)-> {
            var client=order.getClientById(event.getClient_id()).orElseThrow(()-> new IllegalArgumentException("Could not reach the client"));
            client.updateName(event.getName());
        });

        apply((ClientPaymentChanged event)-> {
            var client=order.getClientById(event.getClient_id()).orElseThrow(()-> new IllegalArgumentException("Could not reach the client"));
            client.changePayment(event.getPayment());

        });
    }
}
