package com.company;

public class CoffeeMachineMaker {

    public static void makeDrink(Command command) {
        System.out.println("Please wait, your " + command.getDrink().getName() + " is in process of making with " + command.getSugar() + " piece/pieces of sugar");
    }
}
