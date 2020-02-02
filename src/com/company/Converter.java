package com.company;

public class Converter {

    public Command convert(Input input) throws Exception {
        Drink drinkType = null;
        int sugarQuantity = 0;

        String[] inputToParts = input.getInput().split(":");

        if (inputToParts.length != 0) {

            if (inputToParts[0] != null) {
                switch (inputToParts[0].toLowerCase()) {
                    case "c":
                        drinkType = new Coffee();
                        break;
                    case "t":
                        drinkType = new Tea();
                        break;
                    default:
                        throw new Exception("Please select correct drink type(t or c)");
                }
            }
            if (inputToParts[1] != null) {
                sugarQuantity = Integer.parseInt(inputToParts[1]);
            }
        }


        return new Command(drinkType, sugarQuantity);

    }

}
