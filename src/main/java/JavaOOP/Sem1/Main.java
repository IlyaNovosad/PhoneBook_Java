package JavaOOP.Sem1;

public class Main {
    public static void main(String[] args) {
        Product bottleOne = new BottleOfWater("Cola", 150, 1500);
        Product bottleTwo = new BottleOfWater("BottleTwo", 50, 750);
        Product bottleThree = new BottleOfWater("BottleThree", 120, 1000);
        Product bottleFour = new BottleOfWater("BottleFour", 10, 500);
        VendingMachine vm = new VendingMachineBottleOfWater();
        ((VendingMachineBottleOfWater)vm).addBottle((BottleOfWater) bottleOne);
        ((VendingMachineBottleOfWater)vm).addBottle((BottleOfWater) bottleTwo);
        ((VendingMachineBottleOfWater)vm).addBottle((BottleOfWater) bottleThree);
        ((VendingMachineBottleOfWater)vm).addBottle((BottleOfWater) bottleFour);
        printGetProduct(vm);
    }
    public static void printGetProduct(VendingMachine vendingMachine) {
        System.out.println(vendingMachine.getProduct(vendingMachine.getProduct("Cola")));

    }
}
