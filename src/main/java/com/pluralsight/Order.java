package com.pluralsight;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> menuItems;
    private LocalDateTime localDateTime;


    public Order(List<MenuItem> menuItems, LocalDateTime localDateTime) {
        this.menuItems = new ArrayList<>();
        this.localDateTime = localDateTime;
    }

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

    public void displayOrder() {
        for (MenuItem m : menuItems) {
            System.out.println(m);
        }
    }



}
