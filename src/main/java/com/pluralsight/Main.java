package com.pluralsight;

public class Main {
    //todo put everything into packages
    //addToppingsToPizza broke
    public static void main(String[] args) {


//        UserInterface uI = new UserInterface();
//        uI.display();

        Order order = new Order();

        Pizza pizza = new Pizza("Large", "Thin","sauce", true);
        Topping topping = new Topping("Pepperoni");
        Topping topping2 = new Topping("Sausage");
        Drink drink = new Drink("Sprite", "Large");

        pizza.addTopping(topping);
        pizza.addTopping(topping2);
        order.addMenuItem(pizza);
        order.addMenuItem(drink);
        //Todo make display order look nice
       // order.display();
        System.out.println(pizza);

//        System.out.println(order.getReceiptText());

//        System.out.println(pizza.getPrice());





    }
}
