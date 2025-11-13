package com.pluralsight;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> menuItems;
    private LocalDateTime localDateTime;




    public Order() {
        this.menuItems = new ArrayList<>();
        this.localDateTime = LocalDateTime.now();
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void addMenuItem(MenuItem menuItem){
        this.menuItems.add(menuItem);
    }

    public void display() {
        for (MenuItem m : menuItems) {
            System.out.println(m);
        }
        if (menuItems.size() > 1) {
            System.out.printf("Current total: $%.2f%n", getOrderTotal());
        }

    }






    public double getOrderTotal(){
        double orderTotal = 0;
        for (MenuItem m : menuItems){
            orderTotal +=m.getPrice();
        }
        return orderTotal;
    }



}
