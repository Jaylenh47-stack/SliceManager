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
        return this.description;
    }
}
