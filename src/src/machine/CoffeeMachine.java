package src.machine;


import src.machine.controller.ActionController;
import src.machine.controller.Actions;
import src.machine.models.CoffeeMachineModel;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Actions actions = new Actions();
        ActionController actionController = new ActionController();
        CoffeeMachineModel coffeeMachineModel = new CoffeeMachineModel(400,540, 120, 9, 550);
        actionController.run(coffeeMachineModel, scanner, actions);

    }
}
