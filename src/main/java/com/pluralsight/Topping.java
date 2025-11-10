package com.pluralsight;

public class Topping extends MenuItem {

    private boolean isPremium;

    public Topping(String description, boolean isPremium) {
        super(description);
        this.isPremium = !isPremium;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
