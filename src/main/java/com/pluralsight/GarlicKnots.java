package com.pluralsight;

public class GarlicKnots extends MenuItem{


    public GarlicKnots() {
        super("3 Garlic Knots");
    }

    @Override
    public double getPrice() {
        return 1.50;
    }

    @Override
    public String toString() {
        return String.format("%s | %.2f",this.description , this.getPrice());
    }
}
