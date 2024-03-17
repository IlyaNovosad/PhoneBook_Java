package JavaOOP.HomeTask7Final.Model;

public class Divide implements Operations {
    @Override
    public double calculateOperations(double num1, double num2) {
        if (num2 == 0){
            System.out.println("You can't divide by zero");
            throw new ArithmeticException();
        }
        return num1 / num2;
    }
}
