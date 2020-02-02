package com.company;

public class Command {

    private Drink drink;
    private int sugar;

    public Command(Drink drink, int sugar) {
        this.drink = drink;
        this.sugar = sugar;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }
}
