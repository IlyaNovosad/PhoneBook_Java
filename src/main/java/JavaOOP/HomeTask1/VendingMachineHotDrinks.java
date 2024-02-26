package JavaOOP.HomeTask1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineHotDrinks implements VendingMachine {
    private List<HotDrink> productList;

    public VendingMachineHotDrinks() {
        this.productList = new ArrayList<>();
    }


    public void addHotDrink(HotDrink drink) {
        productList.add(drink);
    }

    public Product getProduct(String name, double volume, int temperature) {
        for (HotDrink product : productList) {
            if (product.getName().equals(name) &&
                    product.getVolume() == volume &&
                    product.getTemperature() == temperature)
                return product;
        }
        return null;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name))
                return product;
        }
        return null;
    }

    public void initProduct(List<HotDrink> list) {
        productList = list;
    }
}