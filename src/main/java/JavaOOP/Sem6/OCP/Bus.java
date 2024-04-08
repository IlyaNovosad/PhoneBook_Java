package JavaOOP.Sem6.OCP;

import JavaOOP.Sem6.Vehicle;

public class Bus extends Vehicle {
    public Bus(int maxSpeed) {
        super(maxSpeed, "Bus");
    }

    @Override
    public double calculateMaxSpeed() {
        return super.calculateMaxSpeed() * 0.5;
    }
}
