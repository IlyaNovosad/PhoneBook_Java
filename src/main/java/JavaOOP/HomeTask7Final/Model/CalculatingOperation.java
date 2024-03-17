package JavaOOP.HomeTask7Final.Model;

import java.util.logging.*;

public abstract class CalculatingOperation {
    Calculator calculator = new Calculator();
    Logger logger = Logger.getLogger(CalculatingOperation.class.getName());
    private double result;


    public abstract double getResult();

    public double getResult(double num1, String operator, double num2) {
        switch (operator) {
            case "+":
                calculator.calculatorOperation(new Addition());
                this.result = calculator.calculate(num1, num2);
                logger.info("Adding numbers " + num1 + " and " + num2);
                break;
            case "-":
                calculator.calculatorOperation(new Subtraction());
                this.result = calculator.calculate(num1, num2);
                logger.info("Subtraction from a number " + num1 + " a number " + num2);
                break;
            case "*":
                calculator.calculatorOperation(new Multiplication());
                this.result = calculator.calculate(num1, num2);
                logger.info("Multiplication of numbers " + num1 + " and " + num2);
                break;
            case "/":
                calculator.calculatorOperation(new Divide());
                this.result = calculator.calculate(num1, num2);
                logger.info("Dividing a number "+num1 + " by " + num2);
                break;
        }
        return this.result;
    }
}