package com.pluralsight;

public class Topping extends MenuItem {
    private String category;
    private boolean isPremium;
    private boolean isExtra;

    public Topping(String description, boolean isPremium, boolean isExtra) {
        super(description);
        this.isPremium = isPremium;
        this.isExtra = isExtra;
    }

    public boolean isPremium() {
        if (category.equals("meat") || category.equals("cheese")){
            return isPremium;
        }
        else{
            return !isPremium;
        }
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
        double premiumPrice = 0;
        if (this.category.equals("meat")){
            premiumPrice = 1;
        }
        else if (this.category.equals("cheese")){
            premiumPrice = 0.75;
        }



        return premiumPrice;
    }

    public double isExtraPricing(Pizza pizza){
        double extraOption= 0;
        int sizeInflation = 0;

        //multiplier for the extra toppings option based on size
        if (pizza.getSize().equals("small")){
            sizeInflation = 1;
        }
        else if(pizza.getSize().equals("medium")){
            sizeInflation = 2;
        }
        else{
            sizeInflation = 3;
        }


        if (isExtra){
            if(category.equals("meat")){
                extraOption = .50 * sizeInflation;

            } else if (category.equals("cheese")) {
                extraOption = .30 *sizeInflation;
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
