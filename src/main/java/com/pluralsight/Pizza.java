package com.pluralsight;

import java.util.List;

public class Pizza extends MenuItem{
    private String size;
    private String crustType;
    private List<Topping> toppings;

    public Pizza( String size, String crustType, List<Topping> toppings) {
        super("Pizza");
        this.size = size;
        this.crustType = crustType;
        this.toppings = toppings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCrustType() {
        return crustType;
    }

    public void setCrustType(String crustType) {
        this.crustType = crustType;
    }

    public List<Topping> getToppings() {
        return toppings;
    }


    @Override
    public double getPrice() {
        return 0;
    }
}
