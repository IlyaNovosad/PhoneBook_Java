package JavaOOP.Sem6.ISP;

public class Qube implements Shape, Shape3D{
    private final int length;

    public Qube(int length) {
        this.length = length;
    }

    @Override
    public double perimeter() {
        return length * 12;
    }

    @Override
    public double value() {
        return length * length * length;
    }
}
