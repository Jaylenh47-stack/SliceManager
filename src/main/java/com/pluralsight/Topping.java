package com.pluralsight;

public class Topping extends MenuItem {
    private String category;
    private boolean isPremium;
    private boolean isExtra;

    public Topping(String description) {
        super(description);
        this.category = switch(this.description){
            case "Pepperoni", "Sausage", "Ham", "Bacon", "Chicken", "Meatball" -> "meat";
            case "Mozzarella", "Parmesan", "Ricotta", "Goat Cheese", "Buffalo" -> "cheese";
            default -> "regular";
        };

        this.isPremium = switch(category){
            case "meat", "cheese" -> true;
            default -> false;
        };

        this.isExtra = false;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
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
        //Topping price is determined by if it's extra and if it's premium

        return isExtraPricing() + isPremiumPricing();
    }
}
