package JavaOOP.Sem6;

import lombok.Getter;

public class Vehicle {
    private final int maxSpeed;
    @Getter
    private final String type;

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public double calculateMaxSpeed() {
        return maxSpeed;
    }
}
