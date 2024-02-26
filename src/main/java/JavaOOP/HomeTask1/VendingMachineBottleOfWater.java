package JavaOOP.HomeTask1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineBottleOfWater implements VendingMachine {

    private List<BottleOfWater> productList;

    public VendingMachineBottleOfWater() {
        this.productList = new ArrayList<>();
    }

    public void addBottle(BottleOfWater bottle) {
        productList.add(bottle);
    }

    @Override
    public Product getProduct(String name) {
        for (BottleOfWater product : productList) {
            if (product.getName().equals(name))
                return product;
        }
        return null;
    }


    public void initProduct(List<BottleOfWater> list) {
        productList = list;
    }
    public static VendingMachineBottleOfWater getVendingMachineBottleOfWater() {
        BottleOfWater bottle1 = new BottleOfWater("Вода1", 100, 5);
        BottleOfWater bottle2 = new BottleOfWater("Вода2", 150, 10);
        BottleOfWater bottle3 = new BottleOfWater("Вода3", 1, 0.5);
        BottleOfWater bottle4 = new BottleOfWater("Вода4", 10, 2);
        VendingMachineBottleOfWater vmBottleOfWater = new VendingMachineBottleOfWater();
        vmBottleOfWater.addBottle(bottle1);
        vmBottleOfWater.addBottle(bottle2);
        vmBottleOfWater.addBottle(bottle3);
        vmBottleOfWater.addBottle(bottle4);
        return vmBottleOfWater;
    }
}