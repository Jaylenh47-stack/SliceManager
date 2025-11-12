package com.pluralsight;

public class Main {

    public static void main(String[] args) {


//        UserInterface uI = new UserInterface();
//        uI.display();

        Pizza pizza = new Pizza("Large", "thin",true);
        Topping topping = new Topping("Pepperoni");
        Topping topping2 = new Topping("Sausage");
        pizza.addTopping(topping);
        pizza.addTopping(topping2);

        System.out.println(pizza.getPrice());




    }
}
