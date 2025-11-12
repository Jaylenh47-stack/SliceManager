package com.pluralsight;

public class Drink extends MenuItem {
    private String size;

    public Drink(String description, String size) {
        super(description);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public double getPrice() {
        if (this.description.equals("Water")) {
            return 0;
        } else {
            if (this.size.equals("Small")){
                return 2.00;
            }
            else if (this.size.equals("Medium")) {
                return 2.50;
            }
            else{
                return 3.00;
            }


        }
    }

    @Override
    public String toString() {
        return this.size + " "+ this.description;
    }
}

