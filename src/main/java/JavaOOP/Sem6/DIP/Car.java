package JavaOOP.Sem6.DIP;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
    public void start() {
        engine.start();
    }
}
