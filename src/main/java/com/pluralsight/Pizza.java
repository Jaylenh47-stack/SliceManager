package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends MenuItem{
    private String size;
    private String crustType;
    private String sauce;
    private boolean isStuffed;
    private List<Topping> toppings;

    public Pizza( String size, String crustType, String sauce, boolean isStuffed) {
        super(String.format("%s Pizza",size));
        this.size = size;
        this.crustType = crustType + " crust";
        this.isStuffed = isStuffed;
        this.sauce = sauce;
        this.toppings = new ArrayList<>();
    }

    public String getSize(){
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

    public boolean isStuffed() {
        return isStuffed;
    }

    public void setStuffed(boolean stuffed) {
        isStuffed = stuffed;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void addTopping(Topping topping){
          this.toppings.add(topping);
    }




    public double basePricing(){
        switch (this.size){
            case "Personal (8\")":
                return 8.50;
            case "Medium (12\")":
                return 12.00;
            case "Large (16\")":
                return 16.00;
            default:
                return 8.50;
        }
    }

    public String getSauce() {
        return sauce;
    }

    public double isStuffedPricing(){
      return (isStuffed)? 1.00 : 0;

    }

    public double toppingsPricing(){

        int sizeInflation = 0;

        //multiplier for the extra toppings option based on size
        if (this.getSize().equals("Personal")){
            sizeInflation = 1;
        }
        else if(this.getSize().equals("Medium")){
            sizeInflation = 2;
        }
        else{
            sizeInflation = 3;
        }

      List<Double> toppingsPrice = this.toppings.stream().map(t -> t.getPrice()).toList();
      double toppingsTotal = toppingsPrice.stream().reduce((double) 0, (temp, num) -> temp +=num);

      return toppingsTotal * sizeInflation;
    }



    @Override
    public double getPrice() {
        return basePricing() + isStuffedPricing() + toppingsPricing();
    }



    //todo fix toString so that it prints the pizza and the toppings it has
    @Override
    public String toString() {
        //add "Stuffed to every stuffed crust pizza
        String stuffed = "";
        if (this.isStuffed){
            stuffed = "Stuffed";
        }


        if (this.toppings.isEmpty()){
        return String.format("%s %s %s| $%.2f",stuffed,crustType, description, getPrice());
    }
        else{
        StringBuilder sB = new StringBuilder();
            sB.append(String.format("%s %s %s with ",stuffed,crustType, description));
            for(Topping t : toppings){
                sB.append(t + ", " );
            }
            sB.append(String.format("| %.2f", this.getPrice()));
            return sB.toString();
        }
    }
}
