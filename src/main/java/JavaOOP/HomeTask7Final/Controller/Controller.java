package JavaOOP.HomeTask7Final.Controller;


import JavaOOP.HomeTask7Final.Model.CalculatingOperation;
import JavaOOP.HomeTask7Final.View.Print;
import JavaOOP.HomeTask7Final.View.UserInputNumbers;
import JavaOOP.HomeTask7Final.View.UserInputOperator;

import java.util.Scanner;

public class Controller extends CalculatingOperation implements UserInputNumbers, UserInputOperator {
    private final Scanner scanner;
    Print print = new Print();

    public Controller() {
        this.scanner = new Scanner(System.in);
    }


    @Override
    public double inputNum1() {
        System.out.println("Enter a first number, please: ");
        return scanner.nextDouble();
    }

    @Override
    public double inputNum2() {
        System.out.println("Enter a second number, please: ");
        return scanner.nextDouble();
    }

    @Override
    public String inputOperator() {
        System.out.println("Input operator, please (+, -, *, /): ");
        return scanner.next();
    }
    @Override
    public double getResult() {
        return super.getResult(inputNum1(),inputOperator(), inputNum2());
    }

    public void printResult(){
        print.print(getResult());
    }

}