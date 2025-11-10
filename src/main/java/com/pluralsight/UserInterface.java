package com.pluralsight;

public class UserInterface {




    public UserInterface(){
    }

    public int homeScreenChoice(){
        return ConsoleHelper.promptForInt("""
                1) New Order
                0) Exit""");
    }



    public int display(){
        while (true) {
            switch (homeScreenChoice()) {
                case 0:
                    System.exit(0);
                case 1:
                   // orderScreen();
                    //method for taking order screen input and displaying proper screen
                    return 0;
            }
        }

    }





    public Pizza makePizzaFromInput() {
        String crustType = ConsoleHelper.promptForString("");
        String size = ConsoleHelper.promptForString("");
        String stuffedCrust = ConsoleHelper.promptForString("Would you like stuff crusted (Yes/No");
        boolean isStuffed = (stuffedCrust.toLowerCase().contains("y"));



        Pizza pizza = new Pizza(size, crustType, isStuffed);
                return pizza;
    }















}
