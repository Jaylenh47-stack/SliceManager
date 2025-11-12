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
                processAddPizzaRequest(order);
//
                break;
            case 2:
                processAddDrinkRequest(order);
                break;
            case 3:
                //processAddGarlicKnotsRequest(order);
                break;
            case 4:
                //order.checkout();
            case 0:
                //order.cancel()


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
            default -> "Invalid input, please enter a 1, 2, 3, or 4 to choose your crust";
        };
        return crustType;
    }

    public String convertIntToPizzaSize(){
        System.out.println("Which size would you like");
        int userInput = ConsoleHelper.promptForInt("1)Personal (8\")    2)Medium (12\")    3)Large (16\")");
        String size = switch(userInput){
            case 1 -> "Personal (8\")";
            case 2 -> "Medium (12\")";
            case 3 -> "Large (16\")";
            default -> "Invalid input, please enter a 1, 2, or 3 to choose your size";
        };
        return size;
    }

    public String convertIntToSauce(){
        System.out.println("Select your sauce");
        int userInput = ConsoleHelper.promptForInt("1)Marinara   2)Alfredo    3)Pesto    4)BBQ    5)Buffalo    6)Olive oil");
        String sauce = switch(userInput){
            case 1 -> "Marinara";
            case 2 -> "Alfredo";
            case 3 -> "Pesto";
            case 4 -> "BBQr";
            case 5 -> "Buffalo";
            case 6 -> "Olive oil";
            default -> "Invalid input, please enter a 1, 2, 3, 4, 5, or 6 to choose your sauce";
        };
        return sauce;
    }


    public Pizza makePizzaWithoutToppings() {

        //converIntToString methods prompts for the userInput and switches it to the string based on the matching input
        String crustType = convertIntToCrustType();
        String size = convertIntToPizzaSize();
        String sauce = convertIntToSauce();
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
            //Todo make toppings screen into a new method
            System.out.println("Choose your toppings, Enter 0 when finished");
            int toppingChoice = ConsoleHelper.promptForInt("""
                    Meats ($1:00)   1) Pepporoni    2)Sausase   3)Ham   4)Bacon    5)Chicken    6)Meatball
                    
                    Cheese (0.75)   7) Mozzarella   8)Parmesan  9)Ricotta   10)Goat Cheese  11)Buffalo
                    
                    Regular (FREE)  12)Onions   13)Mushrooms    14)bell peppers    15)olives    16)tomatoes
                                    17)Spinach    18)Basil    19)Pineapple    20)Anchovies
                    """);

            //ToDo make convertIntToTopping()
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


    public Order processAddPizzaRequest(Order order){
        Pizza p = makePizzaWithoutToppings();
        addToppingsToPizza(p);
        order.addMenuItem(p);
        order.displayOrder();

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
        int userChoice = ConsoleHelper.promptForInt("");
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
        int userChoice = ConsoleHelper.promptForInt("");
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

        System.out.println("1)Small    2)Medium    3)Large");
        String size = convertIntToDrinkSize();

        Drink d = new Drink(description, size);
        order.addMenuItem(d);

        order.displayOrder();
        return order;

    }















}
