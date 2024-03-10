package JavaOOP.Sem1;

import java.util.List;

public interface VendingMachine {
    public void initProducts(List<Product> list);
    public String getProduct(String name);
    public List<Product> getProductList();
    public  void setProductList();
}
