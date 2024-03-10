package JavaOOP.Sem1;

public class BottleOfWater extends Product{
    private final double volume;
    public BottleOfWater(String name, int cost, double volume) {
        super(name, cost);
        this.volume = volume;
    }
    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "BottleOfWater{ " +
                "name = '" + this.getName() + '\'' +
                ", cost = " + this.getCost() +
                " volume = " + volume +
                '}';
    }
}
