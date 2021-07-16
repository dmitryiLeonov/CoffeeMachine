package src.machine.models;

public class CoffeeMachineModel {
    int water;
    int milk;
    int coffeBeans;
    int cups;
    int money;

    public CoffeeMachineModel(int water, int milk, int coffeBeans, int cups, int money) {
        this.water = water;
        this.milk = milk;
        this.coffeBeans = coffeBeans;
        this.cups = cups;
        this.money = money;
    }

    @Override
    public String toString() {
        return "\nThe coffee machine has:\n" +
                "" + water + " ml of water\n" +
                "" + milk+ " ml of milk\n" +
                "" + coffeBeans +" g of coffee beans\n" +
                "" + cups + " disposable cups\n" +
                "$"+this.money+ " of money\n";
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getCoffeBeans() {
        return coffeBeans;
    }

    public void setCoffeBeans(int coffeBeans) {
        this.coffeBeans = coffeBeans;
    }

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
