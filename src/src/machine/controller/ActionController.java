package src.machine.controller;

import src.machine.models.CoffeeMachineModel;

import java.util.Scanner;

public class ActionController {
    public void run(CoffeeMachineModel coffeeMachineModel, Scanner scanner, Actions actions){
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String actionStr = scanner.next();

        if (actionStr.equals("buy"))
        {
            actions.buy(coffeeMachineModel, scanner);
            run(coffeeMachineModel, scanner, actions);
        }

        if (actionStr.equals("fill"))
        {
            actions.fill(coffeeMachineModel, scanner);
            run(coffeeMachineModel, scanner, actions);
        }

        if (actionStr.equals("take"))
        {
            actions.take(coffeeMachineModel, scanner);
            run(coffeeMachineModel,scanner,actions);
        }

        if (actionStr.equals("remaining"))
        {
            actions.remaining(coffeeMachineModel, scanner);
            run(coffeeMachineModel, scanner, actions);
        }

        if (actionStr.equals("exit"))
        {
            actions.exit(coffeeMachineModel, scanner);
        }

    }


}
