package com.pluralsight;

public class UserInterface {
    private Order order;

    private void init(){
        Order order = new Order();
    }

    public UserInterface() {
        init();
    }

    public int homeScreenChoice(){
        return ConsoleHelper.promptForInt("""
                1) New Order
                0) Exit""");
    }



    public void display(){
        while (true) {
            switch (homeScreenChoice()) {
                case 0:
                    System.exit(0);
                case 1:
                    processOrderScreenRequest();
                    //switch case for orderScreen

            }
        }
    }

    public int processOrderScreenRequest(){

        return ConsoleHelper.promptForInt("""
                1) Add Pizza
                2) Add Drink
                3) Add Garlic Knots
                4) Checkout
                0) Cancel Order""");
    }




    public Pizza makePizzaWithoutToppings() {
        String crustType = ConsoleHelper.promptForString("");
        String size = ConsoleHelper.promptForString("");
        String stuffedCrust = ConsoleHelper.promptForString("Would you like stuff crusted (Yes/No)");
        boolean isStuffed = (stuffedCrust.toLowerCase().contains("y"));

        Pizza pizza = new Pizza(size, crustType, isStuffed);
        return pizza;
    }
    public int addToppingsToPizza(){
        while (true){
            //Loop toppings to add until user decides to stop
            //add each topping to the pizza
        }
    }

    public void processAddPizzaRequest(){
       Pizza pizza = makePizzaWithoutToppings();
       //addToppingsToPizza()
        order.getMenuItems().add()

    }















}
