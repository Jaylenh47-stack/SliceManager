package com.pluralsight;

public class Topping extends MenuItem {
    private String category;
    private boolean isPremium;
    private boolean isExtra;

    public Topping(String description) {
        super(description);
        this.isPremium = true;
        this.isExtra = true;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        if (category.equals("meat") || category.equals("cheese")){
             isPremium = premium;
        }
        else{
            isPremium = !premium;
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        switch(this.description){
            case "Pepperoni", "Sausage", "Ham", "Bacon", "Chicken", "Meatball":
                this.category = "meat";
            case "Mozzarella", "Permasan", "Ricotta", "Goat Cheese", "Buffalo":
                this.category = "cheese";
        }
    }

    public boolean isExtra() {
        return isExtra;
    }


    public void setExtra(boolean extra) {



        isExtra = extra;
    }

    public double isPremiumPricing(){
       //If it's not a premium topping it is free
        double premiumPrice = 0;

        if (isPremium) {
            if (this.category.equals("meat")) {
                premiumPrice = 1;
            } else if (this.category.equals("cheese")) {
                premiumPrice = 0.75;
            }
        }

        return premiumPrice;
    }

    public double isExtraPricing(){
        double extraOption= 0;



        if (isExtra){
            if(category.equals("meat")){
                extraOption = .50;

            } else if (category.equals("cheese")) {
                extraOption = .30;
            }

            else{
                extraOption = 0;
            }

            }
        return extraOption;
    }

    @Override
    public double getPrice() {
        //Topping price is determined by if its extra and if its meet or cheese
        // add isExtraPricing() + isPremuiumPricing
        //todo figure out how to add pizza to the method

        return isExtraPricing() + isPremiumPricing();
    }
}
