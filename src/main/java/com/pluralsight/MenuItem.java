package com.pluralsight;

public abstract class MenuItem {
    protected String description;


    public MenuItem(String description) {
        this.description = description;
    }

    public abstract double getPrice();
}
