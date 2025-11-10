package com.pluralsight;

public class Topping extends MenuItem {
    private String category;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
