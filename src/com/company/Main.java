package com.company;

public class Main {

    public static void main(String[] args) {

        Input order = new Input();
        Converter converter = new Converter();

        try {
            Command command = converter.convert(order);
            CoffeeMachineMaker cm = new CoffeeMachineMaker();
            cm.makeDrink(command);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
