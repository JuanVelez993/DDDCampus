package com.sofkau.ddd.order;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.drink_detail.values.Drink_Detail_Id;
import com.sofkau.ddd.food_detail.values.Food_Detail_Id;
import com.sofkau.ddd.generic.Name;
import com.sofkau.ddd.order.events.*;
import com.sofkau.ddd.order.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Order extends AggregateEvent<Order_Id> {

    protected Set<Employee> employees;
    protected Set<Client> clients;
    protected Order_Date order_date;
    protected Set<Food_Detail_Id> food_detail_id;
    protected Set<Drink_Detail_Id> drink_detail_id;

    public Order(Order_Id entityId,Order_Date order_date) {
        super(entityId);
        appendChange(new OrderCreated(order_date)).apply();
    }

    private Order(Order_Id entityId){
        super(entityId);
        subscribe(new OrderChange(this));
    }

    public static Order from(Order_Id orderId, List<DomainEvent> events){
        var order = new Order(orderId);
        events.forEach(order::applyEvent);
        return order;
    }

    public void addEmployee(Employee_Id entityId, Employee_Type employee_type, Name name){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(employee_type);
        Objects.requireNonNull(name);
        appendChange(new EmployeeAdded(entityId,employee_type,name)).apply();

    }

    public void addClient(Client_Id entityId,Name name,Payment payment){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(name);
        Objects.requireNonNull(payment);
        appendChange(new ClientAdded(entityId,name,payment)).apply();

    }

    public void addFood_Detail(Food_Detail_Id food_detail_id){
        appendChange(new Food_DetailAdded(food_detail_id)).apply();

    }

    public void addDrink_Detail(Drink_Detail_Id drink_detail_id){
        appendChange(new Drink_DetailAdded(drink_detail_id)).apply();
    }

    public void updateOrder_Date(Order_Date order_date){
        appendChange(new Order_DateUpdated(order_date)).apply();
    }

    public void updateEmployeeName(Employee_Id employee_id,Name name){
        appendChange(new EmployeeNameUpdated(employee_id,name)).apply();

    }

    public void ChangeEmployee_Type(Employee_Id employee_id,Employee_Type employee_type){
        appendChange(new Employee_TypeChanged(employee_id,employee_type)).apply();
    }

    public void updateclientName(Client_Id client_id,Name name){
        appendChange(new ClientNameUpdated(client_id,name)).apply();
    }

    public void ChangeClientPayment(Client_Id client_id,Payment payment){
        appendChange(new ClientPaymentChanged(client_id,payment)).apply();
    }

    public Optional<Employee> getEmployeeById(Employee_Id employee_id){
        return employees.stream().filter(employee -> employee.identity().equals(employee_id)).findFirst();
    }

    public Optional<Client> getClientById(Client_Id client_id){
        return clients.stream().filter(client -> client.identity().equals(client_id)).findFirst();
    }

    public Set<Employee> Employees() {
        return employees;
    }

    public Set<Client> Client() {
        return clients;
    }

    public Order_Date Order_date() {
        return order_date;
    }

    public Set<Food_Detail_Id> Food_detail_id() {
        return food_detail_id;
    }

    public Set<Drink_Detail_Id> Drink_detail_id() {
        return drink_detail_id;
    }
}
