package com.pluralsight;

public class UserInterface {


    public void display(){

       displayHomeScreen();

    }

    public void displayHomeScreen(){
        while (true) {

            System.out.println("""
                
                Welcome to the SliceManager
                ֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎
                1) New Order
                0) Exit""");

            int homeScreenChoice = ConsoleHelper.promptForInt("Enter your command");

            switch (homeScreenChoice) {
                case 0:
                    return;
                case 1:
                    //display order screen
                   displayOrderScreen();
                   break;
            }
        }
    }

    public void displayOrderScreen(){
        Order order = new Order();
        System.out.println("");

        while (true) {

            System.out.println("""
                Order Menu
                ֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎
                1) Add Pizza
                2) Add Drink
                3) Add Garlic Knots
                4) Checkout
                0) Cancel Order""");
            int orderScreenChoice = ConsoleHelper.promptForInt("Enter your command");

            switch(orderScreenChoice){
                case 1:
                    //Make a pizza from user input and add it to the order
                    processAddPizzaRequest(order);
                    break;
                case 2:
                    processAddDrinkRequest(order);
                    break;
                case 3:
                    processAddGarlicKnotsRequest(order);
                    break;
                case 4:
                    //If this method returns true, checkout is successful, return to the homescreen
                   if(processCheckoutRequest(order)){
                       return;
                   }

                   //Checkout unsuccessful, go to the orderScreen
                   else{
                       break;
                   }



                case 0:
                    System.out.println("Order canceled... returning to home menu");
                    return;
            }
        }
    }



    public String convertIntToCrustType(){
        System.out.println("""
                
                Select your crust);
                ֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎
                1)Thin
                2)Regular
                3)Thick
                4)Cauliflower""");

        int userInput = ConsoleHelper.promptForInt("Enter your command");

        String crustType = switch(userInput){
            case 1 -> "Thin";
            case 2 -> "Regular";
            case 3 -> "Thick";
            case 4 -> "Cauliflower";
            default -> "Regular";
        };

        return crustType;
    }

    public String convertIntToPizzaSize(){

        System.out.println("""
                
                What size would you like
                ֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎
                1)Personal (8\")
                2)Medium (12\")
                3)Large (16\")
                """);

        int userInput = ConsoleHelper.promptForInt("Enter your command");
        String size = switch(userInput){
            case 1 -> "Personal (8\")";
            case 2 -> "Medium (12\")";
            case 3 -> "Large (16\")";
            default -> "Personal (8\")";
        };
        return size;
    }

    public String convertIntToSauce(){
        System.out.println("""
              
                Select your sauce
              ֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎
              1)Marinara
              2)Alfredo
              3)Pesto
              4)BBQ
              5)Buffalo
              6)Olive oil""");

        int userInput = ConsoleHelper.promptForInt("Enter your command");
        String sauce = switch(userInput){
            case 1 -> "Marinara";
            case 2 -> "Alfredo";
            case 3 -> "Pesto";
            case 4 -> "BBQ";
            case 5 -> "Buffalo";
            case 6 -> "Olive oil";
            default -> "Marinara";
        };
        return sauce;
    }


    public Pizza makePizzaWithoutToppings() {

        //converIntToString methods prompts for the userInput and switches it to the string based on the matching input
        String crustType = convertIntToCrustType();
        String size = convertIntToPizzaSize();
        String sauce = convertIntToSauce();
        System.out.println();
        boolean isStuffed = ConsoleHelper.promptForYesNo("Would you like stuff crusted");


        Pizza pizza = new Pizza(size, crustType, sauce, isStuffed);
        return pizza;
    }

    //Todo Figure out how you want to display the toppings and handle the meat and cheese
    public Pizza addToppingsToPizza(Pizza pizza){
        Boolean addingToppings = true;


        while (addingToppings) {
            //Loop toppings to add until user decides to stop
            //Todo make toppings screen into a new method and update the price of meat and cheese based on the pizza.getSize()
            System.out.println("""
                    
                    Choose your toppings);
                    ──────────────────────────────────────────────────────────────────────────────────────────
                    Meats ($1:00)   1) Pepporoni    2)Sausase     3)Ham   4)Bacon    5)Chicken    6)Meatball
                    ──────────────────────────────────────────────────────────────────────────────────────────
                    Cheese (0.75)   7) Mozzarella   8)Parmesan    9)Ricotta    10)Goat Cheese     11)Buffalo
                    ──────────────────────────────────────────────────────────────────────────────────────────
                                    12)Onions       13)Mushrooms  14)bell peppers    15)olives    16)tomatoes
                    Regular (FREE)
                                    17)Spinach          18)Basil          19)Pineapple            20)Anchovies
                    ──────────────────────────────────────────────────────────────────────────────────────────
                    """);
            int toppingChoice = ConsoleHelper.promptForInt("Enter 0 when finished");

            String toppingDescription = switch (toppingChoice) {
                case 1 -> "Pepperoni";
                case 2 -> "Sausage";
                case 3 -> "Ham";
                case 4 -> "Bacon";
                case 5 -> "Chicken";
                case 6 -> "Meatball";
                case 7 -> "Mozzarella";
                case 8 -> "Parmesan";
                case 9 -> "Ricotta";
                case 10 -> "Goat Cheese";
                case 11 -> "Buffalo";
                case 12 -> "Onions";
                case 13 -> "Mushrooms";
                case 14 -> "Bell Peppers";
                case 15 -> "Olives";
                case 16 -> "Tomatoes";
                case 17 -> "Spinach";
                case 18 -> "Basil";
                case 19 -> "Pineapple";
                case 20 -> "Anchovies";
                case 0 -> null;  // Signal to exit
                default -> null;
            };

            System.out.println();
            if (toppingDescription ==null) {
                addingToppings = false;
            }

            if (addingToppings) {
                Topping t = new Topping(toppingDescription);
                t.setExtra(ConsoleHelper.promptForYesNo(String.format("Extra %s?", t.description)));
                pizza.addTopping(t);
                System.out.println();
            }


            System.out.println("Current toppings:");
            pizza.getToppings().forEach(System.out::println);

//            for (Topping myTopping : pizza.getToppings()) {
//                System.out.println(myTopping);
//            }
        }
        return pizza;

    }


    public Order processAddPizzaRequest(Order order){
        Pizza p = makePizzaWithoutToppings();
        addToppingsToPizza(p);
        order.addMenuItem(p);

        System.out.println();
        System.out.println("Current Order:");
        order.display();

        return order;
    }

    public void drinksDisplay(){
        System.out.println(String.format("""
                       Select your drink, Enter 0 to skip
                ===============================================
                1)Water    2)Sprite    3)Coca-Cola    4)Fanta(Orange)
                
                5)Dr Pepper    6)Hi-C(Fruit Punch)    7)Minute Maid(Lemonade)
                """));

    }

    public String convertIntToDrinkDescrption(){
        //Method is called after the menu is displayed
        int userChoice = ConsoleHelper.promptForInt("Enter your command");
        String description = switch(userChoice){
            case 1 -> "Water";
            case 2 -> "Sprite";
            case 3 -> "Coca-Cola";
            case 4 -> "Fanta(Orange)";
            case 5 -> "Dr Pepper";
            case 6 -> "Hi-C(Fruit Punch)";
            case 7 -> "Minute Maid(Lemonade)";
            default -> "Water";

        };
        return description;
    }

    public String convertIntToDrinkSize(){
        //Method is called after the drink size is asked for
        int userChoice = ConsoleHelper.promptForInt("Enter your command");
        String size = switch(userChoice){
            case 1 -> "Small";
            case 2 -> "Medium";
            case 3 -> "Large";
            default -> "Small";
        };
        return size;
    }

    public Order processAddDrinkRequest(Order order){
        drinksDisplay();

        //Changes the int from userInput to the matching String description
        String description = convertIntToDrinkDescrption();

        System.out.println("""
                1)Small    
                2)Medium    
                3)Large""");
        String size = convertIntToDrinkSize();

        Drink d = new Drink(description, size);
        order.addMenuItem(d);

        order.display();
        return order;

    }

    public Order processAddGarlicKnotsRequest(Order order){
        System.out.println("=====================");
        System.out.println("How many garlic knots would you like?");
        System.out.println("Sold in packs of 3 for $1.50");

        int garlicKnotsQuantity = ConsoleHelper.promptForInt("Enter your command");

        for (int i = 0; i <garlicKnotsQuantity; i++) {
            GarlicKnots garlicKnots = new GarlicKnots();
            order.addMenuItem(garlicKnots);
        }
        System.out.println();
        System.out.println("Current order");
        order.display();
        return order;
    }

    public boolean processCheckoutRequest(Order order){


        if (order.getMenuItems().isEmpty()){
            System.out.println("Cannot checkout without any items");
            return false;
        }

        System.out.println("֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎");
        System.out.println();
        System.out.println("CONFIRM YOUR ORDER");
        System.out.println();
        order.display();
        System.out.println();
        String confirmOrder = ConsoleHelper.promptForString("Checkout? (Yes/No)");

        if (confirmOrder.toLowerCase().contains("y")){
            System.out.println("Checkout complete");
            System.out.println("Thank you for your purchase");
            ReceiptManager.saveReceipt(order);

        }
        else{
            return false;
        }

        return true;
    }















}
