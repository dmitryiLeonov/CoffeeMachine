package src.machine.controller;


import src.machine.models.Coffee;
import src.machine.models.CoffeeMachineModel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Actions {

    public void fill(CoffeeMachineModel coffeeMachineModel, Scanner scanner)
    {
        System.out.println("Write how many ml of water you want to add:");
        int water = scanner.nextInt();
        coffeeMachineModel.setWater(coffeeMachineModel.getWater() + water);
        System.out.println("Write how many ml of milk you want to add: ");
        int milk = scanner.nextInt();
        coffeeMachineModel.setMilk(coffeeMachineModel.getMilk() + milk);
        System.out.println("Write how many grams of coffee beans you want to add:");
        int coffeeg = scanner.nextInt();
        coffeeMachineModel.setCoffeBeans(coffeeMachineModel.getCoffeBeans() + coffeeg);
        System.out.println("Write how many disposable cups of coffee you want to add:");
        int cups = scanner.nextInt();
        coffeeMachineModel.setCups(coffeeMachineModel.getCups() + cups);
    }

    public void take(CoffeeMachineModel coffeeMachineModel, Scanner scanner)
    {
        System.out.println("I gave you $" + coffeeMachineModel.getMoney());
        coffeeMachineModel.setMoney(0);
    }

    public void remaining(CoffeeMachineModel coffeeMachineModel, Scanner scanner)
    {
        System.out.println(coffeeMachineModel);
    }

    public void exit(CoffeeMachineModel coffeeMachineModel, Scanner scanner)
    {
    }

    public void buy(CoffeeMachineModel coffeeMachineModel, Scanner scanner)
    {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String coffeeSelector = scanner.next();
        Map<String, String> coffeeMap = new HashMap<String,String>();
        coffeeMap.put("1","espresso");
        coffeeMap.put("2","latte");
        coffeeMap.put("3","cappuccino");
        coffeeMap.put("back","back");

        if (coffeeSelector.equals("1"))
        {
            Coffee coffee = new Coffee(16, 0, 250,1, 4);
            coffee.checkAmount(coffeeMachineModel);
        }
        else if (coffeeSelector.equals("2"))
        {
            Coffee coffee = new Coffee(20, 75, 350,1,7);
            coffee.checkAmount(coffeeMachineModel);
        }
        else if (coffeeSelector.equals("3"))
        {
            Coffee coffee = new Coffee(12, 100, 200, 1,6);
            coffee.checkAmount(coffeeMachineModel);
        }
    }
}
