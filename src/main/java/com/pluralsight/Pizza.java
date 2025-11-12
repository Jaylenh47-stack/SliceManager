package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends MenuItem{
    private String size;
    private String crustType;
    private boolean isStuffed;
    private List<Topping> toppings;

    public Pizza( String size, String crustType, boolean isStuffed) {
        super("Pizza");
        this.size = size;
        this.crustType = crustType;
        this.isStuffed = !isStuffed;
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


    public double sizePricing(){
        return 0;
    }

    public double isStuffedPricing(){
        return 0;
    }

    public double toppingsPricing(){
      List<Double> toppingsPrice = this.toppings.stream().map(t -> t.getPrice()).toList();
      double toppingsTotal = toppingsPrice.stream().reduce((double) 0, (temp, num) -> temp +=num);
        return toppingsTotal;
    }



    @Override
    public double getPrice() {
        return sizePricing() + isStuffedPricing() + toppingsPricing();
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "isStuffed=" + isStuffed +
                ", crustType='" + crustType + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
