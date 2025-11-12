package com.pluralsight;

public class UserInterface {
    private Order order;

    private void init(){
        Order order = new Order();
    }

    public UserInterface() {
        init();
    }

    public void homeScreen(){
        System.out.println("""
                Welcome to the SliceManager
                ============================
                1) New Order
                0) Exit""");
    }


    public void display(){

        while (true) {
            homeScreen();
            int homeScreenChoice = ConsoleHelper.promptForInt("");

            switch (homeScreenChoice) {
                case 0:
                    return;
                case 1:
                    //display order screen
                    processNewOrderRequest(orderScreenWithInput());

                    //process add Pizza
                    //process add drink
                    //process add Garlic knots
                    //process checkout
                    //process cancelOrder

                    //switch case for orderScreen

            }
        }
    }

    public int orderScreenWithInput(){

        int orderScreenChoice = ConsoleHelper.promptForInt("""
                1) Add Pizza
                2) Add Drink
                3) Add Garlic Knots
                4) Checkout
                0) Cancel Order""");
        return orderScreenChoice;
    }

    public void processNewOrderRequest(int orderScreenChoice){
       Order order = new Order();
        switch(orderScreenChoice){
            case 1:
                //Make a pizza from user input
                Pizza p = makePizzaWithoutToppings();
                addToppingsToPizza(p);
                order.addMenuItem(p);

        }
    }


    public Pizza makePizzaWithoutToppings() {
        //ToDo fix prompts so that the user has to input a number to get their crustType and size
        String crustType = ConsoleHelper.promptForString("Select your crust");
        String size = ConsoleHelper.promptForString("8\", 12\", 16\"");
        String stuffedCrust = ConsoleHelper.promptForString("Would you like stuff crusted (Yes/No)");
        boolean isStuffed = (stuffedCrust.toLowerCase().contains("y"));

        Pizza pizza = new Pizza(size, crustType, isStuffed);
        return pizza;
    }

    //Todo Figure out how you want to display the toppings and handle the meat and cheese
    public int addToppingsToPizza(Pizza pizza){
        while (true){
            //Loop toppings to add until user decides to stop
            System.out.println("Choose your toppings:");
            int toppingChoice = ConsoleHelper.promptForInt("""
                    Meats ($1:00)   1) pepporoni    2)sausase   3)ham   4)bacon 5)
                    Cheese (0.75)
                    """);
            String description = "";
           // boolean
           // Topping topping = new Topping()

            //add each topping to the pizza
        }
    }

    public void processAddPizzaRequest(){
       Pizza pizza = makePizzaWithoutToppings();
       //addToppingsToPizza()
        //add pizz to order


    }















}
