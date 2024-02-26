package JavaOOP.HomeTask1;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
abstract public class Product {
    private String name;
    private int cost;

    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}