package JavaOOP.HomeTask1;


import static JavaOOP.HomeTask1.VendingMachineBottleOfWater.getVendingMachineBottleOfWater;

public class Main {
    public static void main(String[] args) {
        VendingMachineBottleOfWater vmBottleOfWater = getVendingMachineBottleOfWater();


        System.out.println(vmBottleOfWater.getProduct("Вода1"));

        VendingMachineHotDrinks vm = new VendingMachineHotDrinks();
        vm.addHotDrink(new HotDrink("Coffee", 100, 0.3, 80));
        vm.addHotDrink(new HotDrink("Tea", 100, 0.3, 100));
        vm.addHotDrink(new HotDrink("Espresso", 100, 0.1, 80));

        System.out.println(vm.getProduct("Tea"));
        System.out.println(vm.getProduct("Coffee", 0.3, 10));
        System.out.println(vm.getProduct("Coffee", 0.3, 80));
    }
}