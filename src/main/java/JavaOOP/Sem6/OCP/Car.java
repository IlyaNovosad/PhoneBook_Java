package JavaOOP.Sem6.OCP;

import JavaOOP.Sem6.Vehicle;

public class Car extends Vehicle {
    public Car(int maxSpeed) {
        super(maxSpeed, "Car");
    }

    @Override
    public double calculateMaxSpeed() {
        return super.calculateMaxSpeed() * 0.8;
    }

}
