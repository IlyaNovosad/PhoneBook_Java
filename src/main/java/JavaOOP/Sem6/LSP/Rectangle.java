package JavaOOP.Sem6.LSP;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rectangle extends QuadRangle{
    private int weight;
    private int length;

    public Rectangle(int weight, int length) {
        this.weight = weight;
        this.length = length;
    }

    @Override
    public int area() {
        return weight * length;
    }
}
