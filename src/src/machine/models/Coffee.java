package src.machine.models;

public class Coffee {
    public int gramsOfCoffee;
    public int milk;
    public int water;
    public int cup;
    public int money;

    boolean canBuy = true;

    public Coffee(int gramsOfCoffee, int MILK, int WATER, int cup, int MONEY) {
        this.gramsOfCoffee = gramsOfCoffee;
        this.milk = MILK;
        this.water = WATER;
        this.cup = cup;
        this.money = MONEY;
    }


    public void checkAmount(CoffeeMachineModel coffeeMachine) {
        if (coffeeMachine.getCoffeBeans() > this.gramsOfCoffee) {
            if (canBuy) {
                canBuy = true;
            }
        } else {
            System.out.println("Sorry, not enough coffee!\n");
            canBuy = false;
        }
        if (coffeeMachine.getWater() > this.water) {
            if (canBuy) {
                canBuy = true;
            }
        } else {
            System.out.println("Sorry, not enough water!\n");
            canBuy = false;
        }
        if (coffeeMachine.getMilk() > this.milk) {
            if (canBuy) {
                canBuy = true;
            }
        } else {
            System.out.println("Sorry, not enough milk!\n");
            canBuy = false;
        }
        if (coffeeMachine.getMilk() > 1) {
            if (canBuy) {
                canBuy = true;
            }
        } else {
            System.out.println("Sorry, not enough cups!\n");
            canBuy = false;
        }
        if (canBuy){
            System.out.println("I have enough resources, making you a coffee!");
            coffeeMachine.setCoffeBeans(coffeeMachine.getCoffeBeans() - this.gramsOfCoffee);
            coffeeMachine.setWater(coffeeMachine.getWater() - this.water);
            coffeeMachine.setMilk(coffeeMachine.getMilk() - this.milk);
            coffeeMachine.setCups(coffeeMachine.getCups() - this.cup);
            coffeeMachine.setMoney(coffeeMachine.getMoney() + this.money);
        }
    }
}
