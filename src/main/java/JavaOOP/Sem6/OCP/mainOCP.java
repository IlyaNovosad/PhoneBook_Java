package JavaOOP.Sem6.OCP;

import JavaOOP.Sem6.Vehicle;

public class mainOCP {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(100, "Ship");
        Vehicle vehicle1 = new Car(100);
        Vehicle vehicle2 = new Bus(100);
        printMaxSpeed(vehicle);
        printMaxSpeed(vehicle1);
        printMaxSpeed(vehicle2);

    }
    static void printMaxSpeed(Vehicle vehicle) {
        System.out.println(vehicle.calculateMaxSpeed());
    }
}
