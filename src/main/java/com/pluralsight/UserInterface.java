package com.pluralsight;

public class UserInterface {


    public UserInterface() {
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
                    while (true) {
                        processNewOrderRequest(orderScreenWithInput());
                    }



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
                //Make a pizza from user input and add it to the order
                Pizza p = makePizzaWithoutToppings();
                addToppingsToPizza(p);
                order.addMenuItem(p);
                order.displayOrder();
                break;
            case 2:

        }
    }

    public String convertIntToCrustType(){
        System.out.println("Select your crust");
        int userInput = ConsoleHelper.promptForInt("1)Thin    2)Regular    3)Thick    4)Cauliflower");
        String crustType = switch(userInput){
            case 1 -> "Thin";
            case 2 -> "Regular";
            case 3 -> "Thick";
            case 4 -> "Cauliflower";
            default -> "Invalid input, please enter a 1, 2, 3, or 4";
        };
        return crustType;
    }


    public Pizza makePizzaWithoutToppings() {
        //ToDo fix prompts so that the user has to input a number to get their crustType and size

        String crustType = convertIntToCrustType();
        //todo add convertIntToCrustType()

        String size = ConsoleHelper.promptForString("Personal (8\"), Medium(12\"), Large (16\")");
        String sauce = ConsoleHelper.promptForString("Select your sauce");
        String stuffedCrust = ConsoleHelper.promptForString("Would you like stuff crusted (Yes/No)");
        boolean isStuffed = (stuffedCrust.toLowerCase().contains("y"));

        Pizza pizza = new Pizza(size, crustType, sauce, isStuffed);
        return pizza;
    }

    //Todo Figure out how you want to display the toppings and handle the meat and cheese
    public void addToppingsToPizza(Pizza pizza){
        Boolean addingToppings = true;
        Topping t = new Topping("");

        while (addingToppings){
            //Loop toppings to add until user decides to stop
            System.out.println("Choose your toppings, Enter 0 when finished");
            int toppingChoice = ConsoleHelper.promptForInt("""
                    Meats ($1:00)   1) Pepporoni    2)Sausase   3)Ham   4)Bacon    5)Chicken    6)Meatball
                    
                    Cheese (0.75)   7) Mozzarella   8)Parmesan  9)Ricotta   10)Goat Cheese  11)Buffalo
                    
                    Regular (FREE)  12)Onions   13)Mushrooms    14)bell peppers    15)olives    16)tomatoes
                                    17)Spinach    18)Basil    19)Pineapple    20)Anchovies
                    """);


            switch  (toppingChoice){
                case 1 -> t.setDescription("Pepperoni");
                case 2 -> t.setDescription("Sausage");
                case 3 -> t.setDescription("Ham");
                case 4 -> t.setDescription("Bacon");
                case 5 -> t.setDescription("Chicken");
                case 6 -> t.setDescription("Meatball");
                case 7 -> t.setDescription("Mozzarella");
                case 8 -> t.setDescription("Parmesan");
                case 9 -> t.setDescription("Ricotta");
                case 10 -> t.setDescription("Goat Cheese");
                case 11-> t.setDescription("Buffalo");
                case 12 -> t.setDescription("Onions");
                case 13 -> t.setDescription("Mushrooms");
                case 14 -> t.setDescription("Bell Peppers");
                case 15 -> t.setDescription("Olives");
                case 16 -> t.setDescription("Tomatoes");
                case 17 -> t.setDescription("Spinach");
                case 18 -> t.setDescription("Basil");
                case 19 -> t.setDescription("Pineapple");
                case 20-> t.setDescription("Anchovies");
                case 0-> addingToppings = false;
                }
            pizza.addTopping(t);
            }

        }


    public void processAddPizzaRequest(){
       Pizza pizza = makePizzaWithoutToppings();
       //addToppingsToPizza()
        //add pizz to order

    }















}
