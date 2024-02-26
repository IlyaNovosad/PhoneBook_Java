package JavaOOP.HomeTask1;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BottleOfWater extends Product {
    private double volume;

    public BottleOfWater(String name, int cost, double volume) {
        super(name, cost);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getCost() +
                ", volume=" + volume +
                '}';
    }
}