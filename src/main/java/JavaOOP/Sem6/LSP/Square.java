package JavaOOP.Sem6.LSP;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Square extends QuadRangle{
    private int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public int area() {
        return length * length;
    }
}
