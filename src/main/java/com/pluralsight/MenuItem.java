package com.pluralsight;

public abstract class MenuItem {
    private String description;

    public MenuItem(String description) {
        this.description = description;
    }

    public abstract double getPrice();
}
