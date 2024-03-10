package JavaOOP.Sem1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineBottleOfWater implements VendingMachine{
    private  List<Product> productList;
    public VendingMachineBottleOfWater() {
        this.productList = new ArrayList<>();
    }

    @Override
    public void initProducts(List<Product> list) {
        productList = list;
    }

    @Override
    public String getProduct(String name) {
        for (Product product : productList) {
            if (name.equals(product.getName())) return String.valueOf(product);
        }
        return null;
    }

    @Override
    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public void setProductList() {
        this.productList = productList;
    }
    public void addBottle(BottleOfWater bottle) {
        productList.add(bottle);
    }
}
